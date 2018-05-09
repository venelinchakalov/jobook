package jobook.models.classes.job_impl;

import jobook.models.interfaces.job_package.Benefits;

public class BenefitsImpl implements Benefits {

    private String payment;
    private String insurance;
    private String officeLocation;
    
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }


}
