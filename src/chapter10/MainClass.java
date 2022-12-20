package chapter10;

import chapter9.Cat;

public class MainClass {
    public static void main(String[] args) {
        Animal aja = new Goat();
        cat myGoat = (cat) aja;
        aja.speak();
        myGoat.eat();
    }
}
