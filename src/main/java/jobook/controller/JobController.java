package jobook.controller;

import jobook.cv.classes.CVImpl;
import jobook.cv.interfaces.CV;
import jobook.models.classes.job_impl.BenefitsImpl;
import jobook.models.classes.job_impl.CriteriaImpl;
import jobook.models.classes.job_impl.JobImpl;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.root_package.User;
import jobook.models.interfaces.users_package.Employee;
import jobook.models.interfaces.users_package.Employer;
import jobook.repository.interfaces.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.ws.rs.GET;
import org.springframework.beans.factory.annotation.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;
@Controller
public class JobController {

    @Autowired
    private Repository repository;

    @GetMapping(value = "/createjob")
    public String getJobPage(){
        return "/job-form-view/job-form";
    }

    @PostMapping(value = "/createjob")
    public String registerJob(JobImpl job, CriteriaImpl criteria, BenefitsImpl benefits, @RequestParam("profilePic") MultipartFile image) throws IOException {
        Employer user;
        try {
             user = (Employer) repository.getLoggedInUser();
        }catch (ClassCastException ex){
            return "/errors/wrong-reg-type";
        }
        if (user != null) {


            byte[] encodeBase64 = Base64.getEncoder().encode(image.getBytes());
            String base64Encoded = new String(encodeBase64, "UTF-8");
            job.writeImg(base64Encoded);
            String id = repository.findIDByUser(user);
            job.setID(id);
            job.setCriteria(criteria);
            job.setBenefits(benefits);

            repository.linkJob(user, job);
            repository.writeImg(user, image.getBytes());
            return "redirect:/showjob";
        }
        else
            return "/errors/wrong-reg-type";

    }




    @GetMapping(value = "/showjob")
    public String showJobOffer( Model model) throws IOException {
        User user =(Employer) repository.getLoggedInUser();
        Job job = repository.findJobByUser(user);

        model.addAttribute("user" , user);
        model.addAttribute("job",job);

        return "/job-museum/job-view";
    }

    @GetMapping(value = "/showjob/{userID}")
    public String showCVMuseum( @PathVariable String userID, Model model) throws IOException {
        User user = repository.findById(userID);
        if(user == null){
            return "/errors/no-cv-error";
        }
        Job job = repository.findJobByUser(user);

        model.addAttribute("job",job);

        return "/job-museum/job-view";
    }


}
