package jobook.models.interfaces.users_package;

import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.root_package.User;

import java.util.List;

public interface Employer extends User {

    void postJob(Job job);
    List<Employee> getEmployeesBySkills(Criteria criteria);



}
