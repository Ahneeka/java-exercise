package diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static Scanner keyboardInput = new Scanner(System.in);
    private static Diary diary;

    public static void main(String[] args) {
        String mainMain = """
                Welcome to my Diary!!!
                let's setIt up
                """;
        print(mainMain);
        String userName = input("Enter your name");
        String password = input("Enter your password");
        diary = new Diary(userName,password);
        print("Diary created for"+userName);
        displayLockMenu();
    }


    private static void displayDiaryMenu(){
        String mainMain = """
                Press 1 -> Unlock Diary
                Press2 -> Lock Diary
                Press3 -> exist
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)){
            case 1 -> unlockeDiary();
            case 2-> lockDiary();
            case 3 -> exitApplication();
        }
    }

//    private static String input(String prompt) {
//        System.out.println(prompt);
//        return keyboardInput.nextLine();
//    }

    private static void exitApplication() {
        print("Thanks for using our application");
    }

    private static void lockDiary() {
        diary.lock();
        print("Locked successfully");
    }

    private static void unlockeDiary() {
        String password = input("Enter correct password");
        diary.UnlockWith(password);
        if(diary.islocked()){
            print("Wrong password");
            displayLockMenu();
        }
        displayDiaryMenu();
    }

    private static void displayLockMenu() {
        String diaryMenu = """
                press
                1 -> Create Happening
                2 -> Find entry by id
                3 -> Get total number of entries
                4 -> Lock diary
                """;

        String userInput = input(diaryMenu);
        switch (Integer.parseInt(userInput)){
            case 1 -> CreateHappening();
            case 2 -> findById();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> lockDiary();
        }
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfHappening();
        print("You have "+ totalNumberOfEntry+" Happenings");
        displayDiaryMenu();
    }

    private static void findById() {
        String title = input("Enter id for the happening you want to find");
        Happening foundHappening = diary.findHappeningWithid(Integer.parseInt(title));
        print(foundHappening.toString());
        displayDiaryMenu();
    }

    private static void CreateHappening() {
        String title = input("Enter title of the happening ");
        String body = input("Enter body of the happening");
        diary.write(title,body);
        print("Written Succesfully");
        displayDiaryMenu();
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(null,prompt);
    }
    private static void print(String prompt) {
//        print(prompt);
        JOptionPane.showMessageDialog(null,prompt);
    }


}
