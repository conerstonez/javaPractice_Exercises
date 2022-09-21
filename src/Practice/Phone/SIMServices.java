package Practice.Phone;


import java.util.Scanner;

public class SIMServices {
    static Scanner key = new Scanner(System.in);
    static int n;
        public static void simServices() {
            System.out.println("""
            ...SIM services
            ___SERVICES___
            99. Main menu
            """);
            n = key.nextInt();
            if (n == 99) { MainMenu.phone(); }
            else { System.out.println("invalid number"); simServices(); }
        }
    }

