package org.fasttrack.curs8.Exercise2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee implements Person{
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;

    public Employee(String firstName, String lastName, LocalDate birthDay, String address, LocalDate dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String vechime(){
        Period vechime = Period.between(this.dateOfEmployment, LocalDate.now());
        String strVechime = vechime.getYears()  + " ani "  + vechime.getMonths() + " luni si " + vechime.getDays() + " zile.";
        return strVechime;
        //return String.format("Ani %s, Luni %s, zile %s",vechime.getYears(),vechime.getMonths(),vechime.getDays());
    }
}
