package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class PhoneBook {
    static Scanner key = new Scanner(System.in);
    static int n;
    static int b;
    static int c;
    public static void phonebook() {
        System.out.println("""
            ...Phone book
            1. Search
            2. Service Nos.
            3. Add name
            4. Erase
            5 Edit
            6 Assign tone
            7. Send b'card
            8. Options
            9. Speed dials
            10. Voice tags
            99. Main Menu
            """);
        n = key.nextInt();
        switch (n) {
            case 1:
                System.out.println("""
                    ___search___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 2:
                System.out.println("""
                    ___service nos.___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 3:
                System.out.println("""
                    ___add name___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 4:
                System.out.println("""
                    ___erase___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 5:
                System.out.println("""
                    ___edit___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 6:
                System.out.println("""
                    ___assign tone___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 7:
                System.out.println("""
                    ___send b'card___
                    "0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 8: options();
            case 9:
                System.out.println("""
                    ___speed dials___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 10:
                System.out.println("""
                    ___voice tags___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { phonebook(); }
                else { System.out.println("option does not exist"); phone(); }
            case 99: phone();
            default: System.out.println("invalid number"); phonebook();
        }
    }
    private static void options() {
        System.out.println("""
                    ___option___
                    1. Type of view
                    2. Memory status
                    0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
                ___type of view___
                0. back""");
            c = key.nextInt();
            if (c == 0) options();
            else System.out.println("option does not exist"); phonebook();
        }
        else if (b == 2) { System.out.println("""
                ___memory status___
                0. back""");
            c = key.nextInt();
            if (c == 0) options();
            else System.out.println("option does not exist"); phonebook();
        }
        else if (b == 0) { phonebook(); }
        else { System.out.println("option does not exist"); phone(); }
    }
}
