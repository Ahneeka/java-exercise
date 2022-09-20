package chapter3;

public class HealthRecords {
   private String firstName;
   private String lastName;
  private String gender;
  private int monthOfBirth;
  private int dayOfBirth;
  private int yearOfBirth;
  private int height;
  private int weight;
  private int age;

  public HealthRecords(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, int height, int weight, int age ){
      this.firstName = firstName;
      this. lastName = lastName;
      this. gender = gender;
      this. monthOfBirth = monthOfBirth;
      this. dayOfBirth = dayOfBirth;
      this. yearOfBirth = yearOfBirth;
      this. height = height;
      this. weight = weight;
      this. age = age;

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
   public String getlastName(){
      return lastName;
  }
   public void setGender(String gender){
      this.gender = gender;
  }
   public String getGender(){
      return gender;
   }
   public void setMonthOfBirth(int monthOfBirth){
      this.monthOfBirth = monthOfBirth;
   }
   public int getMonthOfBirthI(){
      return monthOfBirth;
   }
   public void setDayOfBirth(int dayOfBirth){
      this.dayOfBirth = dayOfBirth;
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
   public void setHeight(int height){
      this.height = height;
   }
   public int getHeight(){
      return height;
   }
   public void setWeight(int weight){
      this.weight = weight;
   }
   public int getWeight(){
      return weight;
   }
   public void setAge(int age) {
       this.age = age;
   }
   public int getAge(){
      age = 2022 - yearOfBirth;
      return age;
   }
   public int getmaximumHeartRate(){
       return 220-age;
   }
   public void getmaximumTargetRate(){
      int Heart = 50 * getmaximumHeartRate() / 100;
      int Target = 85 * getmaximumHeartRate() / 100;
   System.out.printf ("the target heart rate is %d and %d beat per minute ", Heart, Target);
   }
   public void getBMI(){
      int BMI = (weight * 703) / (height * height);
       System.out.printf("the patient BMI is %d ", BMI);
   }
   }




