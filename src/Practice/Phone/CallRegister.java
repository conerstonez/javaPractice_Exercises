package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class CallRegister {
    static Scanner key = new Scanner(System.in);
    static int n;
    static int b;
    static int c;
    public static void callRegister() {
        System.out.println("""
            ...Call register
            1. Missed calls
            2. Received calls
            3. Dailled numbers
            4. Erase recent call lists
            5. Show call duration
            6. Show call costs
            7. Call costs settings
            8. Prepaid credit
            99. Main menu
            """);
        n = key.nextInt();
        switch (n) {
            case 1:
                System.out.println("""
                    ___missed calls___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { callRegister(); }
                else { System.out.println("option does not exist"); phone(); }
            case 2:
                System.out.println("""
                    ___received calls___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { callRegister(); }
                else { System.out.println("option does not exist"); phone(); }
            case 3:
                System.out.println("""
                    ___Dailled numbers ___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { callRegister(); }
                else { System.out.println("option does not exist"); phone(); }
            case 4:
                System.out.println("""
                    ___erase recent call lists___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { callRegister(); }
                else { System.out.println("option does not exist"); phone(); }
            case 5: scd();
            case 6: scc();
            case 7: ccs();
            case 8:
                System.out.println("""
                    ___prepaid credit___
                    0. back""");
                b = key.nextInt();
                if (b == 0) { callRegister(); }
                else { System.out.println("option does not exist"); phone(); }
            case 99: phone();
            default: System.out.println("invalid number"); callRegister();
        }
    }
    private static void scd() {
        System.out.println("""
                    ___show call duration___
                    1. Last call duration
                    2. All calls' duration
                    3. Received calls' duration
                    4. Dailled calls' duration
                    5. Clear timers
                    0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
                ___last call duration___
                0. back""");
            c = key.nextInt();
            if (c == 0) scd();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 2) { System.out.println("""
                ___all calls' duration___
                0. back""");
            c = key.nextInt();
            if (c == 0) scd();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 3) { System.out.println("""
                ___received call's duration___
                0. back""");
            c = key.nextInt();
            if (c == 0) scd();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 4) { System.out.println("""
                ___dailled calls' duration___
                0. back""");
            c = key.nextInt();
            if (c == 0) scd();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 5) { System.out.println("""
                ___clear timers___
                0. back""");
            c = key.nextInt();
            if (c == 0) scd();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 0) { callRegister(); }
        else { System.out.println("option does not exist"); phone(); }
    }
    private static void scc() {
        System.out.println("""
                    ___show call cost___
                    1. Last call cost
                    2. All calls' cost
                    3. Clear counters
                    0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
              ___last call cost___
              0. back""");
            c = key.nextInt();
            if (c == 0) scc();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 2) { System.out.println("""
                ___all calls' cost___
                0. back""");
            c = key.nextInt();
            if (c == 0) scc();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 3) { System.out.println("""
                ___clear counters___
                0. back""");
            c = key.nextInt();
            if (c == 0) scc();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 0) { callRegister(); }
        else { System.out.println("option does not exist"); phone(); }
    }
    private static void ccs() {
        System.out.println("""
                    ___Call cost settings___
                    1. Call cost limit
                    2. Show costs in
                    0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
                ___call cost limit___
                0. back""");
            c = key.nextInt();
            if (c == 0) ccs();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 2) { System.out.println("""
                ___show costs in___
                0. back""");
            c = key.nextInt();
            if (c == 0) ccs();
            else System.out.println("option does not exist"); callRegister();
        }
        else if (b == 0) { callRegister(); }
        else { System.out.println("option does not exist"); phone(); }
    }
}
