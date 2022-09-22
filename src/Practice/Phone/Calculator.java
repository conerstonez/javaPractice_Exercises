package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Calculator {
    static Scanner key = new Scanner(System.in);
    static int n;
    public static void calculator() {
        System.out.println("""
            ...Calculator
            ___CALCULATOR___
            99. Main menu
            """);
        n = key.nextInt();
        if (n == 99) { phone(); }
        else { System.out.println("invalid number"); calculator(); }
    }
}
