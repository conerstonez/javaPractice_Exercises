package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Chat {
    static Scanner key = new Scanner(System.in);
    static int n;
    public static void chat () {
        System.out.println("""
            ...Chat
            ___CHAT___
            99. Main menu
            """);
        n = key.nextInt();
        if (n == 99) { phone(); }
        else { System.out.println("invalid number"); chat(); }
    }
}
