package chapter10;

public class Dog extends Animal implements Movable{
    @Override
    public void speak(){
        System.out.println("Bark like a dog");
    }

    @Override
    public void move() {
        System.out.println("Dog walk");
    }
}
