package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Tones {
    static Scanner key = new Scanner(System.in);
    static int n;
    static int b;
    public static void tones() {
        System.out.println("""
            ...Tones
            1. Ringing tone
            2. Ringing volume
            3. Incoming call alert
            4. Composer
            5. Message alert tone
            6. Keypad tones
            7. Warning and game tones
            8. Vibrating alert
            9. Screen saver
            99. Main menu
            """);
        n = key.nextInt();
        switch (n) {
            case  1:
                System.out.println("""
                    ___ringing tone___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 2:
                System.out.println("""
                    ___ringing volume___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 3:
                System.out.println("""
                    ___incoming call alert___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 4:
                System.out.println("""
                    ___composer__
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 5:
                System.out.println("""
                    ___message alert tone___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 6:
                System.out.println("""
                    ___keypad tones___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 7:
                System.out.println("""
                    ___warning and game tones___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 8:
                System.out.println("""
                    ___vibrating alert___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 9:
                System.out.println("""
                    ___screen saver___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { tones(); }
                else { System.out.println("option does not exist"); phone(); }
            case 99: phone();
            default: System.out.println("invalid number"); tones();
        }
    }
}
