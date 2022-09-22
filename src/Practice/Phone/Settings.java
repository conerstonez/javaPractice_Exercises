package Practice.Phone;

import java.util.Scanner;

import static Practice.Phone.MainMenu.phone;

public class Settings {
    static Scanner key = new Scanner(System.in);
    static int n;
    static int b;
    static int c;
    public static void settings() {
        System.out.println("""
            ...Settings
            1. Call settings
            2. Phone settings
            3. Security settings
            4. Restore factory settings
            99. Main menu
            """);
        n = key.nextInt();
        switch (n) {
            case 1: callSettings();
            case 2: phoneSettings();
            case 3: securitySettings();
            case 4:
                System.out.println("""
                    ___restore factory settings___
                    1. PIN code request
                    0. back""");
                b = key.nextInt();
                if (b == 1) { System.out.println("___PIN code request___"); }
            case 99: phone();
            default: System.out.println("invalid number"); settings();}
    }
    private static void callSettings() {
        System.out.println("""
                        ___call settings___
                        1. Automatic redail
                        2. Speed dailling
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer
                        0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
                    ___automatic redail___
                    0. back""");
            c = key.nextInt();
            if (c == 0) callSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 2) { System.out.println("""
                    ___speed dailling___
                    0. back""");
            c = key.nextInt();
            if (c == 0) callSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 3) { System.out.println("""
                    ___call waiting options___
                    0. back""");
            c = key.nextInt();
            if (c == 0) callSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 4) { System.out.println("""
                    ___own number sending___
                    0. back""");
            c = key.nextInt();
            if (c == 0) callSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 5) { System.out.println("""
                    ___phone line in use___
                    0. back""");
            c = key.nextInt();
            if (c == 0) callSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 6) { System.out.println("""
                    ___automatic answer___
                    0. back""");
            c = key.nextInt();
            if (c == 0) callSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 0) { settings(); }
        else { System.out.println("option does not exist"); phone(); }
    }
    private static void phoneSettings() {
        System.out.println("""
                        ___phone settings___
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
                        0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
                   ___language___
                   0. back""");
            c = key.nextInt();
            if (c == 0) phoneSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 2) { System.out.println("""
                    ___cell info display___
                    0. back""");
            c = key.nextInt();
            if (c == 0) phoneSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 3) { System.out.println("""
                    ___welcome note___
                    0.back""");
            c = key.nextInt();
            if (c == 0) phoneSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 4) { System.out.println("""
                    ___network selection___
                    0. back""");
            c = key.nextInt();
            if (c == 0) phoneSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 5) { System.out.println("""
                    ___lights___
                    0. back""");
            c = key.nextInt();
            if (c == 0) phoneSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 6) { System.out.println("""
                    ___confirm SIM service actions___
                    0. back""");
            c = key.nextInt();
            if (c == 0) phoneSettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 0) { settings(); }
        else { System.out.println("option does not exist"); phone(); }
    }
    private static void securitySettings() {
        System.out.println("""
                        ___security settings___
                        1. PIN code request
                        2. Call barring service
                        3. Fixed dailling
                        4. Closed user group
                        5. Phone security
                        6. Change access codes
                        0. back""");
        b = key.nextInt();
        if (b == 1) { System.out.println("""
                    ___PIN code request___
                    0. back""");
            c = key.nextInt();
            if (c == 0) securitySettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 2) { System.out.println("""
                    ___call barring service___
                    0. back""");
            c = key.nextInt();
            if (c == 0) securitySettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 3) { System.out.println("""
                    ___fixed dialing___
                    0. back""");
            c = key.nextInt();
            if (c == 0) securitySettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 4) { System.out.println("""
                    ___closed user group___
                    0. back""");
            c = key.nextInt();
            if (c == 0) securitySettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 5) { System.out.println("""
                    ___phone security___
                    0. back""");
            c = key.nextInt();
            if (c == 0) securitySettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 6) { System.out.println("""
                    ___change access codes___
                    0. back""");
            c = key.nextInt();
            if (c == 0) securitySettings();
            else System.out.println("option does not exist"); settings();
        }
        else if (b == 0) { settings(); }
        else { System.out.println("option does not exist"); phone(); }
    }
}
