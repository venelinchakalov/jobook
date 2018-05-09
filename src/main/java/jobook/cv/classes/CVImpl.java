package jobook.cv.classes;

import jobook.cv.interfaces.CV;
import jobook.models.classes.job_impl.CriteriaImpl;
import jobook.models.interfaces.job_package.Criteria;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

public class CVImpl implements CV{

    private String firstName;
    private String lastName;
    private String address;
    private String number;
    private String age;
    private String objective;
    private String skills;
    private String[] major;
    private String[] school;
    private String[] city;
    private String[] position;
    private String[] place;
    private String[] describeJob;
    private String[] dateFrom;
    private String[] dateTo;
    private String[] dateExpFrom;
    private String[] dateExpTo;
    private String   softSkills;
    private String   languages;
    private Criteria criteria;
    private String desiredPosition;
    private String img;
    private String ID;




    @Override
    public String getDesiredPosition() {
        return desiredPosition;
    }

    @Override
    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition;
    }


    private static final long serialVersionUID = 6529685098267757690L;




    @Override
    public String getLanguages() {
        return languages;
    }

    @Override
    public void setLanguages(String languages) {
        this.languages = languages;
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
    public void writeImg(String img) {
        this.img = img;
    }

    @Override
    public String getImg() {
        return this.img;
    }

    public CVImpl(){
        this.criteria = new CriteriaImpl();
    }

    public void setCriteria(){
        this.criteria.setEducation(Arrays.toString(getSchool()));
        this.criteria.setExperience(Arrays.toString(getPosition()));
        this.criteria.setTechnologies(getSkills().toString());
    }

    public String[] getMajor() {
        return major;
    }

    public void setMajor(String[] major) {
        this.major = major;
    }

    @Override
    public Criteria getCriteria() {
        return this.criteria;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String[] getSchool() {
        return school;
    }

    public void setSchool(String[] school) {
        this.school = school;
    }

    public String[] getCity() {
        return city;
    }

    public void setCity(String[] city) {
        this.city = city;
    }

    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public String[] getPlace() {
        return place;
    }

    public void setPlace(String[] place) {
        this.place = place;
    }

    public String[] getDescribeJob() {
        return describeJob;
    }

    public void setDescribeJob(String[] describeJob) {
        this.describeJob = describeJob;
    }

    public String[] getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String[] dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String[] getDateTo() {
        return dateTo;
    }

    public void setDateTo(String[] dateTo) {
        this.dateTo = dateTo;
    }

    public String[] getDateExpFrom() {
        return dateExpFrom;
    }

    public void setDateExpFrom(String[] dateExpFrom) {
        this.dateExpFrom = dateExpFrom;
    }

    public String[] getDateExpTo() {
        return dateExpTo;
    }

    public void setDateExpTo(String[] dateExpTo) {
        this.dateExpTo = dateExpTo;
    }

    public String[] getSkills() {

        return skills.split(",");


    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String[] getSoftSkills() {
        return this.softSkills.split(",");
    }

    public void setSkills(String skills) {


        this.skills = skills;
    }
}
