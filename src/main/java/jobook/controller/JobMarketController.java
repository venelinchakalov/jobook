package jobook.controller;

import jobook.cv.interfaces.CV;
import jobook.models.classes.users_impl.EmployeeImpl;
import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.root_package.User;
import jobook.models.interfaces.users_package.Employee;
import jobook.repository.interfaces.Repository;
import org.springframework.security.core.Authentication;
import org.springframework.ui.*;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.servlet.mvc.support.*;

import java.util.*;

@Controller
public class JobMarketController {


    @Autowired
    private Repository repository;
    private List<Job> jobInfo;
    private boolean isPostReady = false;
    @GetMapping(value = "/jobmarket")
    public String getTalentMarket(Model model, @RequestParam(value = "criteria" , required = false) String criteria){

        jobInfo = repository.getAllJobs();
        if(criteria!=null) {
            if (!criteria.isEmpty()) {
                jobInfo = sortJobs(jobInfo, criteria);
            }
        }

        model.addAttribute("job",jobInfo);

        return "/job-market-view/job-market";
    }




    private List<Job> sortJobs(List<Job> jobs, String desiredCriteria) {
        Set<Job> list = new HashSet<>();
        desiredCriteria = desiredCriteria.replaceAll("," ,  "");
        String[] criteria = desiredCriteria.split("\\s+");

        for(Job job : jobs){
            String jobToText = job.getJobDescription() + " " + job.getCompanyName() + " " + job.getDescription() +
                    " " + job.getPosition() + " " + job.getBenefits().getInsurance() + " " + job.getBenefits().getOfficeLocation()
                    + " " + job.getBenefits().getPayment() + " " + job.getCriteria().getEducation() + " " + job.getCriteria().getExperience() + " "
                    + job.getCriteria().getSoftSkills().toString() + " " + job.getCriteria().getTechnologies().toString();
            //TODO -- to implement it as private static final String and put it as function to decouple it.

            for(String s : criteria) {
                if(jobToText.toLowerCase().contains(s.toLowerCase())){
                    list.add(job);
                }
            }

        }

        return new ArrayList<>(list);
    }


}
