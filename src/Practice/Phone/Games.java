package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Games {
    static Scanner key = new Scanner(System.in);
    static int n;
    public static void games() {
        System.out.println("""
            ...Games
            ___GAME___
            99. Main menu
            """);
        n = key.nextInt();
        if (n == 99) { phone(); }
        else { System.out.println("invalid number"); games(); }
    }
}
