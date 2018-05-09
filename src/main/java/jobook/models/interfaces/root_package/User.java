package jobook.models.interfaces.root_package;

import java.io.Serializable;

public interface User  extends Serializable{

    void setUsername(String username);
    String getUsername();

    void setPassword(String password);
    String getPassword();

    void setFirstName(String firstName);
    String getFirstName();

    void setLastName(String lastName);
    String getLastName();

    void setNumber(String number);
    String getNumber();

    void setMail(String mail);
    String getMail();



}
