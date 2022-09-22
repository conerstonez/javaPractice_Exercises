package Practice.Phone;

import java.util.Scanner;

public class Profile {
    static Scanner key = new Scanner(System.in);
    static int n;
    public static void profile() {
        System.out.println("""
            ...Profiles
            ___PROFILE___
            99. Main menu
            """);
        n = key.nextInt();
        if (n == 99) { MainMenu.phone(); }
        else { System.out.println("invalid number"); profile(); }
    }
}
