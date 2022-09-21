package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Reminder {
    static Scanner key = new Scanner(System.in);
    static int n;
    public static void reminder() {
        System.out.println("""
            ...Reminders
            ___REMINDER___
            99. Main menu
            """);
        n = key.nextInt();
        if (n == 99) { phone(); }
        else { System.out.println("invalid number"); reminder(); }
    }
}
