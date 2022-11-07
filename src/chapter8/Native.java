package chapter8;

public class Native {

    private  String firstName;
    private  String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Native(Human human){
        lastName = human.getLastName();
        if(human.getPhoneNumber().length() != 11) throw new IllegalArgumentException("invalid phone number");
        firstName = human.getFirstName();
        phoneNumber = human.getPhoneNumber();
        emailAddress = human.getEmailAddress();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
