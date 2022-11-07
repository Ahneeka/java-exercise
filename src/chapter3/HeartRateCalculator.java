package chapter3;

public class HeartRateCalculator {
    private String firstName;
    private String lastName;

    private String monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private int age;

    public HeartRateCalculator(String firstName, String lastName,  String monthOfBirth, int dayOfBirth, int yearOfBirth, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.age = age;

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setMonthOfBirth(String monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }
    public String getMonthOfBirth(){
        return monthOfBirth;
    }
    public void setDayOfBirth(int dayOfBirth){
        this. dayOfBirth = dayOfBirth;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        age = 2022 - yearOfBirth;
        return age;
    }
    public int getmaximumHeartRate() {
        return 220 - age;

    }
    public void getmaximumTargetRate(){
        int Heart = 50 * getmaximumHeartRate() / 100;
        int Target = 85 * getmaximumHeartRate() / 100;
        System.out.printf ("the target heart rate is %d and %d beat per minute ", Heart, Target);
    }
}


