import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.setColor("blue");
        Phone.setPrice(80000);
        System.out.println(myPhone.getColor());
        System.out.println(Phone.getPrice());

    }

}