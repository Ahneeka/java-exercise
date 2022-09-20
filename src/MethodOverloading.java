public class MethodOverloading {
    public String pizza(String where){
        return "pizza" + where;
    }
    public  String pizza(){
        return  "pizza bought at just a random place";
    }
    //there is no return type here it's void
    public void pizza(String where,int price){
        System.out.printf("i bought pizza at %s for %d", where,price);
    }
    // the nain method and it can be created in a test class
    public static void main(String[] args) {
        MethodOverloading myOverloading = new MethodOverloading();
        myOverloading.pizza("justrite",2700);
    }

}
