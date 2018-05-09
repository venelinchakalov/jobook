package jobook.models.interfaces.job_package;

import java.io.Serializable;

public interface Benefits extends Serializable{

    void setOfficeLocation(String officeLocation);
    String getOfficeLocation();

    void setPayment(String payment);
    String getPayment();

    void setInsurance(String insurance);
    String getInsurance();


}
