package jobook.models.classes.job_impl;

import jobook.models.interfaces.job_package.Criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriteriaImpl  implements Criteria{

    private String experience;
    private String education;
    private String technologies;
    private String softSkills;


    @Override
    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }


    public List<String> getSoftSkills() {
        return new ArrayList<String>(Arrays.asList(softSkills.split(",")));
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<String> getTechnologies() {
        return new ArrayList<String>(Arrays.asList(technologies.split(",")));
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

}
