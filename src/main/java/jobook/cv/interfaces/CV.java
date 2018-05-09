package jobook.cv.interfaces;

import jobook.models.interfaces.job_package.Criteria;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

public interface CV  extends Serializable{

    //Basic info

    void setFirstName(String firstName);
    String getFirstName();

    void setLastName(String lastName);
    String getLastName();

    void setAddress(String address);
    String getAddress();

    void setNumber(String number);
    String getNumber();

    void setAge(String age);
    String getAge();

    // Education

    void setObjective(String objective);
    String getObjective();

    void setSchool(String[] school);
    String[] getSchool();

    void setDateFrom(String dateFrom[]);
    String[] getDateFrom();

    void setDateTo(String dateTo[]);
    String[] getDateTo();

    void setMajor(String[] major);
    String[] getMajor();

    // Experience

    void setDateExpFrom(String dateExpFrom[]);
    String[] getDateExpFrom();

    void setDateExpTo(String dateExpTo[]);
    String[] getDateExpTo();

    void setCity(String city[]);
    String[] getCity();

    void setPosition(String position[]);
    String[] getPosition();

    void setPlace(String[] place);
    String[] getPlace();

    void setDescribeJob(String[] describeJob);
    String[] getDescribeJob();

   // Skill set

    void setSkills(String skills);
    String[] getSkills();

    void setSoftSkills(String softSkills);
    String[] getSoftSkills();

    void writeImg(String img);
    String getImg();

    void setID(String id);
    String getID();

    void setCriteria();
    Criteria getCriteria();

    void setLanguages(String languages);
    String getLanguages();

    void setDesiredPosition(String desiredPosition);
    String getDesiredPosition();

}

