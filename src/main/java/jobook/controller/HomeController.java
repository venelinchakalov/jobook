package jobook.controller;

import jobook.cv.interfaces.CV;
import jobook.models.classes.users_impl.EmployeeImpl;
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

import java.util.List;


@Controller
public class HomeController {
    @Autowired
    private Repository repository;


    @GetMapping("/")
    public String getHomePage(Model model){

        User user = repository.getLoggedInUser();
        String message = null;

        if(user!=null){

            message = user.getFirstName()+ " " + user.getLastName();

        }

        model.addAttribute("username",message );


        return "index";
    }


    @GetMapping("/login")
    public String getLogInPage(){

        return "/login-view/login-view";
    }


    @GetMapping("/about")
    public String getAbout(){
        return "/talent-view/talent-view";
    }



}


