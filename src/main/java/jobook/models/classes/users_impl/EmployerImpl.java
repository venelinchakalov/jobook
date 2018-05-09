package jobook.models.classes.users_impl;

import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.users_package.Employee;
import jobook.models.interfaces.users_package.Employer;

import java.util.List;

public class EmployerImpl implements Employer {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String number;
    private String mail;
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void postJob(Job job) {

    }

    public List<Employee> getEmployeesBySkills(Criteria criteria) {
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
