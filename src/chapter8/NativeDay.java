package chapter8;

public class NativeDay {
    private Day dayOfBirth;

    public NativeDay(Day dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

    public Day getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Day dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

}
