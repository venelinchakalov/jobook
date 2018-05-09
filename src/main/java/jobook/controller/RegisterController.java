package jobook.controller;

import jobook.models.classes.users_impl.EmployeeImpl;
import jobook.models.classes.users_impl.EmployerImpl;
import jobook.repository.interfaces.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.*;
@Controller
public class RegisterController {

    @Autowired
    private Repository repository;


    @GetMapping("/register")
    public String getRegisterPage(){
        return "/register-view/decide-role";
    }



    @GetMapping("/register/employee")
    public String getEmployeeRegisterPage(){
        return "/register-view/register-view-employee";
    }

    @PostMapping("/register/employee")
    public String recordEmployee(EmployeeImpl employee, Model model){
        if(repository.areCredentialsUnique(employee.getMail())){
            repository.addToDB(employee, "employee");
            return "redirect:/";
        }
        else {
            model.addAttribute("message" , "There is a user with such credentials!");
            return "/register-view/register-view-employee";
        }



    }


    @GetMapping("/register/employer")
    public String getEmployerRegisterPage(){
        return "/register-view/register-view-employer";
    }


    @PostMapping("/register/employer")
    public String recordEmployer(EmployerImpl employer, Model model){
        if(repository.areCredentialsUnique(employer.getMail())){
            repository.addToDB(employer, "employer");
            return "redirect:/";
        }

        else {
            model.addAttribute("message" , "There is a user with such credentials!");
            return "/register-view/register-view-employee";
        }

    }
}
