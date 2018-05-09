package jobook.models.interfaces.job_package;

import java.io.Serializable;

public interface Job  extends Serializable {
    void setCompanyName(String companyName);
    String getCompanyName();

    void setPosition(String position);
    String getPosition();

    void setCriteria(Criteria criteria);
    Criteria getCriteria();

    void setDescription(String description);
    String getDescription();

    void setBenefits(Benefits benefits);
    Benefits getBenefits();

    void setJobDescription(String jobDescription);
    String getJobDescription();

    void writeImg(String img);
    String getImg();

    void setID(String id);
    String getID();
}
