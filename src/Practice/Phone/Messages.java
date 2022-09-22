package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Messages {
    static Scanner key = new Scanner(System.in);
    static int n;
    static int b;
    static int c;
    static int d;
    public static void messages() {
        System.out.println("""
            ...Messages
            1. Write messages
            2. Inbox
            3. Outbox
            4. Picture messages
            5. Templates
            6. Smileys
            7. Message settings
            8. Info service
            9. Voice mailbox number
            10. service command editor
            99. Main menu
            """);
        n = key.nextInt();
        switch (n) {
            case 1:
                System.out.println("""
                    ___write messages___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 2:
                System.out.println("""
                    ___inbox___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 3:
                System.out.println("""
                    ___outbox___
                    "0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 4:
                System.out.println("""
                    ___picture messages___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 5:
                System.out.println("""
                    ___templates___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 6:
                System.out.println("""
                    ___smileys___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 7:
                System.out.println("""
                    ___message settings___
                    1. Set 1
                    2. Common
                    0. back""");
                b = key.nextInt();
                if (b == 1) { set1(); }
                else if (b == 2) { common(); }
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 8:
                System.out.println("""
                    ___info service___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 9:
                System.out.println("""
                    ___voice mailbox number___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 10:
                System.out.println("""
                    ___service command editor___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { messages(); }
                else { System.out.println("option does not exist"); phone(); }
            case 99: phone();
            default: System.out.println("invalid number"); messages();
        }
    }
    private static void set1() {
        System.out.println("""
                                ___set 1___
                                1. Message centre number
                                2. Messages sent as
                                3. Message validity
                                0. back""");
        c = key.nextInt();
        if (c == 1) {
            System.out.println("""
        ___message centre number___
        0. back""");
            d = key.nextInt();
            if (d == 0) set1();
            else System.out.println("option does not exist"); messages();
        } else if (c == 2) {
            System.out.println("""
        ___message sent as___
        0. back""");
            d = key.nextInt();
            if (d == 0) set1();
            else System.out.println("option does not exist"); messages();
        } else if (c == 3) {
            System.out.println("""
        ___message validity___
        0. back""");
            d = key.nextInt();
            if (d == 0) set1();
            else System.out.println("option does not exist"); messages();
        } else if (c == 0) { messages(); }
        else { System.out.println("option does not exist"); phone(); }
    }
    private static void common() {
        System.out.println("""
                                ___common___
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                0. back""");
        c = key.nextInt();
        if (c == 1) {
            System.out.println("""
        ___delivery reports___
        0. back""");
            d = key.nextInt();
            if (d == 0) common();
            else System.out.println("option does not exist"); messages();
        } else if (c == 2) {
            System.out.println("""
        ___reply via same centre___
        0. back""");
            d = key.nextInt();
            if (d == 0) common();
            else System.out.println("option does not exist"); messages();
        } else if (c == 3) {
            System.out.println("""
        ___character support___
        0. back""");
            d = key.nextInt();
            if (d == 0) common();
            else System.out.println("option does not exist"); messages();
        } else if (c == 0) { messages(); }
        else { System.out.println("option does not exist"); phone(); }
    }
}
