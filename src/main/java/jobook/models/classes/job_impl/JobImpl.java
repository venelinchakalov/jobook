package jobook.models.classes.job_impl;

import jobook.models.interfaces.job_package.Benefits;
import jobook.models.interfaces.job_package.Criteria;
import jobook.models.interfaces.job_package.Job;

public class JobImpl implements Job {

    private String companyName;
    private String description;
    private Criteria criteria;
    private Benefits benefits;
    private String jobDescription;
    private String img;
    private String ID;
    private String position;

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String getImg() {
        return img;
    }

    public void writeImg(String img) {
        this.img = img;
    }



    @Override
    public String getJobDescription() {
        return jobDescription;
    }

    @Override
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public Benefits getBenefits() {
        return benefits;
    }

    public void setBenefits(Benefits benefits) {
        this.benefits = benefits;
    }
}
