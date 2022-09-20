package snack;

public class AutomaticBike {
    private boolean poweredOn;

    public void turnOn(boolean value) {
        poweredOn = value;
    }

    public boolean isOn() {
        return poweredOn;
    }
}
