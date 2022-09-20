public class Phone {

    private String color;
    private static int price;

    public void setColor(String color){
        this.color = color;
    }
    public static void setPrice(int price){
        Phone.price = price;
    }
    public String getColor(){
        return color;
    }
    public static int getPrice(){
        return price;
    }
}
