package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Clock {
    static Scanner key = new Scanner(System.in);
    static int n;
    static int b;
    static int c;
    public static void clock() {
        System.out.println("""
            ...Clock
            1. Alarm clock
            2. Clock settings
            3. Date setting
            4. Stopwatch
            5. Countdown timer
            6. Auto update of date and time
            99. Main menu
            """);
        n = key.nextInt();
        switch (n) {
            case 1:
                System.out.println("""
                    ___alarm clock___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { clock(); }
                else { System.out.println("option does not exist"); phone(); }
            case 2:
                System.out.println("""
                    ___clock settings___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { clock(); }
                else { System.out.println("option does not exist"); phone(); }
            case 3:
                System.out.println("""
                    __date setting___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { clock(); }
                else { System.out.println("option does not exist"); phone(); }
            case 4:
                System.out.println("""
                    ___stopwatch___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { clock(); }
                else { System.out.println("option does not exist"); phone(); }
            case 5:
                System.out.println("""
                    ___countdown timer___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { clock(); }
                else { System.out.println("option does not exist"); phone(); }
            case 6:
                System.out.println("""
                    ___auto update of date and timer___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { clock(); }
                else { System.out.println("option does not exist"); phone(); }
            case 99: phone();
            default: System.out.println("invalid number"); clock();
        }
    }
}
