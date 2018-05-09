package jobook.models.interfaces.users_package;

import jobook.cv.interfaces.CV;
import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;
import jobook.models.interfaces.root_package.User;

import java.util.List;

public interface Employee extends User {

    List<Job> findByCriteria(Criteria criteria);
    void setCV(CV cv);

}
