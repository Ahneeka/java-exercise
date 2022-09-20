import java.util.Scanner;

public class NokiaPhone {
    private static int option;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("YOU ARE WELCOME,\n" +
                        "Press 1: for phonebook \n" +
                        "Press 2: for messages\n" +
                        "Press 3: for Chat\n" +
                        "Press 4: for call register\n " +
                        "press 5: Tone" +
                        "\nPress 6: Settings\n" +
                        "Press 7: for call divert\n" +
                        "Press 8: for games\n" +
                        "Press 9: for calculator\n" +
                        "Press 10:for reminders\n" +
                        "Press 11: for clock\n" +
                        "Press 12: for profiles\n" +
                        "Press 13: for SIM services\n" +
                        "Press 0: to switch off phone" +
                        "Press 20: to go back to main menu" +
                        "Press 30: to continue ");


                int phone1 = input.nextInt();
                switch (phone1) {
                    case 1:
                        while (true) {
                            System.out.println("1: Search\n  " +
                                    "2:Service Nos.\n " +
                                    "3: Add name\n " +
                                    "4:Erase\n" +
                                    "5:Edit\n" +
                                    "6:Assign tone\n " +
                                    "7:send cards\n" +
                                    "8:options\n " +
                                    "9:speed dials\n" +
                                    "10: voice tags");

                            int phone = input.nextInt();
                            if (phone == 20) {
                                break;
                            }

                            switch (phone) {
                                case 8:
                                    while (true) {
                                        System.out.println("1: type of view\n " +
                                                "2: memory status\n");

                                        int option = input.nextInt();
                                        if (option == 20) {
                                            break;
                                        }
                                    }
                                    break;

                                default:
                                    break;

                            }
                        }
                        break;

                    case 2:
                        while (true) {
                            System.out.println("1: write messages\n" +
                                    "2: inbox\n " +
                                    "3: outbox\n" +
                                    "4: picture messages:\n" +
                                    "5: templates\n" +
                                    "6: smileys\n " +
                                    "7: message settings\n " +
                                    "8: info service\n " +
                                    "9: voice mailbox number\n " +
                                    "10: service command editor ");


                            int ahnee = input.nextInt();
                            if (ahnee == 20) {
                                break;
                            }
                            switch (ahnee) {
                                case 7:
                                    while (true) {
                                        System.out.println("1. Set 1\n" +
                                                "2. Common\n");

                                        int bbb = input.nextInt();
                                        if (bbb == 20) {
                                            break;
                                        }
                                        switch (bbb) {
                                            case 1:
                                                while (true) {
                                                    System.out.println("1: message centre number\n" +
                                                            "2: message sent as\n" +
                                                            "3: message validity\n ");

                                                    int ccc = input.nextInt();
                                                    if (ccc == 20) {
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 2:
                                                while (true) {
                                                    System.out.println(
                                                            "1: delivery reports\n " +
                                                                    "2: reply via same centre\n " +
                                                                    "3: character support");
                                                    int ddd = input.nextInt();
                                                    if (ddd == 20) {
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                            }
                        }
                        break;


                    case 3:
                        while (true) {
                            System.out.println("chat");
                            int eee = input.nextInt();
                            if (eee == 20) {
                                break;
                            }
                        }
                        break;

                    case 4:
                        System.out.println("1: missed calls\n " +
                                "2: received calls\n " +
                                "3: dialled numbers\n " +
                                "4: erase recent call\n  " +
                                "5: show call duration\n " +
                                "6: show call costs\n" +
                                "7: call costs settings\n" +
                                "8: prepaid credit");
                        int fff = input.nextInt();
                        if (fff == 20) {
                            break;
                        }
                        switch (fff) {
                            case 5:
                                while (true) {
                                    System.out.println("1 last call duration\n " +
                                            "2: all call's duration\n " +
                                            "3: received call's durations\n " +
                                            "4: dialled call's durations\n " +
                                            "5: clear times\n");
                                    int iphone = input.nextInt();
                                    if (iphone == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 6:
                                while (true) {
                                    System.out.println("1: last call costs\n " +
                                            "2: all call's costs\n " +
                                            "3: clear counters\n ");
                                    int mmm = input.nextInt();
                                    if (mmm == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 7:
                                while (true) {
                                    System.out.println("1: call cost limit\n " +
                                            "2: show costs in ");
                                    int abc = input.nextInt();
                                    if (abc == 20) {
                                        break;
                                    }
                                }
                                break;
                        }
                        break;

                    case 5:
                        System.out.println("1: ringing tone\n " +
                                "2: ringing volume\n " +
                                "3: incoming call alert\n " +
                                "4: composer\n " +
                                "5: message alert tone\n " +
                                "6: keypad tones\n " +
                                "7: warning and game tones" +
                                "8: vibrating alert\n" +
                                "9: screen saver");
                        int blue = input.nextInt();


                    case 6:
                        System.out.println("1: call settings\n " +
                                " 2: phone settings\n" +
                                "3: security settings\n" +
                                "4: restore factory settings\n  ");

                        int yellow = input.nextInt();
                        switch (yellow) {
                            case 1:
                                while (true) {
                                    System.out.println("1: automatic dial\n " +
                                            "2: speed dialing" +
                                            "3: call waiting options" +
                                            "4: own number settings\n" +
                                            "5: phone line in use\n  " +
                                            "6: automatic answer\n");
                                    int ggg = input.nextInt();
                                    if (ggg == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                while (true) {
                                    System.out.println("1: language\n " +
                                            "2: cell info display\n " +
                                            "3: welcome note\n" +
                                            "4: network selection\n " +
                                            "5: lights\n " +
                                            "6: confirm SIM service actions\n ");
                                    int ggg = input.nextInt();
                                    if (ggg == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                while (true) {
                                    System.out.println("1: PIN code request\n " +
                                            "2: call barring service\n " +
                                            "3: fixed dialing\n " +
                                            "4: closed user group\n " +
                                            "5: phone security\n " +
                                            "6: change access codes\n");
                                    int sss = input.nextInt();
                                    if (sss == 20) {
                                        break;
                                    }
                                }
                                break;

                            case 7:
                                while (true) {
                                    System.out.println("call divert");
                                    int green = input.nextInt();
                                    if (green == 20) {
                                        break;
                                    }
                                }
                                break;

                            case 8:
                                while (true) {
                                    System.out.println("games");
                                    int nike = input.nextInt();
                                    if (nike == 20) {
                                        break;
                                    }
                                }
                                break;

                            case 9:
                                while (true) {
                                    System.out.println("calculator");
                                    int num = input.nextInt();
                                    if (num == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 10:
                                while (true) {
                                    System.out.println("reminders");
                                    int val = input.nextInt();
                                    if (val == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 11:
                                while (true) {
                                    System.out.println(" clock\n " +
                                            "1: alarm clock\n " +
                                            "2: clock settings\n" +
                                            "3: date settings\\n \" +\n" +
                                            "4: stopwatch\\n" +
                                            "5: countdown timer\\n " +
                                            "6: auto update of date and time\\n ");
                                    int iphone = input.nextInt();
                                    if (iphone == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 12:
                                while (true) {
                                    System.out.println("profiles");
                                    int samsung = input.nextInt();
                                    if (samsung == 20) {
                                        break;
                                    }
                                }
                                break;
                            case 13:
                                while (true) {
                                    System.out.println("SIM services");
                                    int black = input.nextInt();
                                    if (black == 20) {
                                        break;
                                    }
                                }
                                break;
                        }

                }
            }
        }
    }

