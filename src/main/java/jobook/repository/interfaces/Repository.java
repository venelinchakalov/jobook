package jobook.repository.interfaces;

import jobook.cv.interfaces.CV;
import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.root_package.User;
import jobook.models.interfaces.users_package.Employee;
import org.springframework.stereotype.*;
import jobook.models.interfaces.users_package.Employer;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.File;
import java.util.List;

@Component

public interface Repository {
    User findByName(String mail);
    User findById(String id);

    void addToDB(User user, String role);

    User getLoggedInUser();

    void writeImg(User user, byte[] bytes);
    byte[] getImage(User user);
    boolean areCredentialsUnique(String mail);

    void linkJob(Employer employer, Job job);
    void linkCV(Employee employee, CV cv);


    CV findCVByUser(User user);
    Job findJobByUser(User user);
    CV findCVById(String id);
    List<CV> getAllCVs();
    List<Job> getAllJobs();

    String findIDByUser(User user);

    CV findCVByCriteria(Criteria criteria);
    Job findJobByCriteria(Criteria criteria);



}
