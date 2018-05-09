package jobook.controller;

import jobook.cv.classes.CVImpl;
import jobook.cv.interfaces.CV;
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
public class CVController {
    @Autowired
    private Repository repository;


    @GetMapping(value = "/createcv")
    public String showCVform(){

        return "/cv-view/cv-form";
    }

    @PostMapping(value = "/createcv")
    public String registerUserCV(CVImpl cv, @RequestParam("profilePic") MultipartFile image) throws IOException {
        Employee user;
        try {
            user = (Employee) repository.getLoggedInUser();
        }catch (ClassCastException ex){
            return "/errors/wrong-reg-type";
        }

        if (user != null) {

        byte[] encodeBase64 = Base64.getEncoder().encode(image.getBytes());
        String base64Encoded = new String(encodeBase64, "UTF-8");
        cv.writeImg(base64Encoded);
        String id = repository.findIDByUser(user);
        cv.setID(id);
        repository.linkCV(user,cv);
        repository.writeImg(user, image.getBytes());

        return "redirect:/showcv";
        }else
            return  "/errors/wrong-reg-type";

    }


    @GetMapping(value = "/showcv")
    public String showCVMuseum( Model model) throws IOException {
            User user = repository.getLoggedInUser();
            CV cv = repository.findCVByUser(user);

            model.addAttribute("cv",cv);

            return "/cv-view-app-form/cv-view";
    }

    @GetMapping(value = "/showcv/{userID}")
    public String showCVMuseum( @PathVariable String userID, Model model) throws IOException {
            CV cv = repository.findCVById(userID);
            User user = repository.findById(userID);
            if(user == null){
                return "/errors/no-cv-error";
            }

            model.addAttribute("cv",cv);

            return "/cv-view-app-form/cv-view";
    }



}

