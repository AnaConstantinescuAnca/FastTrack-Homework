package org.fasttrack.curs8.Exercise2;
import java.time.LocalDate;
//import java.util.Date;

public interface Person {
    String getFirstName();
    String getLastName();
    LocalDate getBirthDay();
    String getAddress();

    String fullName();

    String ageEmployee();
}
