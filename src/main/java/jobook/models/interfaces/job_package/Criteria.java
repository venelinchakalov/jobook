package jobook.models.interfaces.job_package;

import java.io.Serializable;
import java.util.List;

public interface Criteria  extends Serializable{

    String getExperience();
    void setExperience(String experience);

    String getEducation();
    void setEducation(String education);

    List<String> getTechnologies();
    void setTechnologies(String technologies);

    List<String> getSoftSkills();
    void setSoftSkills(String softSkills);



}
