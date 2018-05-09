package jobook.controller;
import jobook.cv.interfaces.CV;
import jobook.models.classes.users_impl.EmployeeImpl;
import jobook.models.interfaces.job_package.Criteria;
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
public class TalentMarketController {
    @Autowired
    private Repository repository;
    private List<CV> cvInfo;
    private boolean isPostReady = false;
    @GetMapping(value = "/talentmarket")
    public String getTalentMarket(Model model, @RequestParam(value = "criteria" , required = false) String criteria){

        cvInfo = repository.getAllCVs();
        if(criteria!=null) {
            if (!criteria.isEmpty()) {
                cvInfo = sortCVs(cvInfo, criteria);
            }
        }

        model.addAttribute("cvList",cvInfo);

        return "/talent-view/talent-view";
    }

//    @PostMapping(value = "/talentmarket")
//    public String filterCVs(@RequestParam("criteria") String criteria, Model model) {
//        List<CV> listedArray = repository.getAllCVs();
//        cvInfo = sortCVs(listedArray , criteria);
//        if(criteria.isEmpty()){
//            isPostReady = false;
//        }
//        else {
//            isPostReady = true;
//        }
//        model.addAttribute("cvList" , cvInfo);
//        return "/cv-market-view/talent-market";
//    }



    private List<CV> sortCVs(List<CV> candidates, String desiredCriteria) {
        Set<CV> list = new HashSet<>();
        desiredCriteria = desiredCriteria.replaceAll("," ,  "");
        String[] criteria = desiredCriteria.split("\\s+");

        for(CV cv : candidates){
            String CVtoText = "Address: " + cv.getAddress() + " ." + '\n' +
                    "Name: " + cv.getFirstName() + " " + cv.getLastName() + " ." + '\n' +
                    "Age: " + cv.getAge() + " years old. " + '\n' +
                    "Position: " + Arrays.toString(cv.getPosition()) + ". " + '\n' +
                    "Objective: " + cv.getObjective() + " ." + '\n' +
                    "Experience and Education: " + cv.getDescribeJob() + '\n' +
                     Arrays.toString(cv.getCity()) + " " +   Arrays.toString(cv.getPlace()) + " " + Arrays.toString(cv.getSchool()) + '\n' +
                    "Tech Stack: " + Arrays.toString(cv.getSkills()) + '\n' +
                    "Soft skills: " + Arrays.toString(cv.getSoftSkills());
            //TODO -- to implement it as private static final String and put it as function to decouple it.

            for(String s : criteria) {
                if(CVtoText.toLowerCase().contains(s.toLowerCase())){
                    list.add(cv);
                }
            }

        }

        return new ArrayList<>(list);
        }

}
