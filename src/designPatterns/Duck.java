package designPatterns;

public class Duck {

    private Flyable flyable;
    private Quackable quackable;

    public Duck(Flyable fly, Quackable quack){
        this.flyable = fly;
        this.quackable = quack;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void flyable() {
    }

    public void fly() {
    }
}
