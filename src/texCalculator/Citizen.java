package texCalculator;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surname;
    private BigDecimal earnings;

    public Citizen(){

    }
    public  Citizen(String firstName,String surname){
        this.firstName = firstName;
        surname = surname;
    }
    public  Citizen(String firstName,String surname,BigDecimal earnings){
        this(firstName, surname);
        this.earnings = earnings;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }



}
