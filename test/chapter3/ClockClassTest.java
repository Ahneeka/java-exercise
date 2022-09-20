package chapter3;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ClockClassTest {
    public static void main(String[] args) {
        ClockClass myClock = new ClockClass(23,59,59);
        myClock.setHour(24);
        myClock.setMinute(60);
        myClock.setSeconds(60);

        displayTime(myClock);

    }

    private static void displayTime(ClockClass myClock) {

            System.out.print("display time: ");
            System.out.printf("%02d:", myClock.getHour());
            System.out.printf("%02d:", myClock.getMinute());
            System.out.printf("%02d",myClock.getSeconds() );

        }
    }


