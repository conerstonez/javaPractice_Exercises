package Practice.Phone;

import java.util.Scanner;

public class MainMenu {
    static Scanner key = new Scanner(System.in);
    public static void phone() {
        while (true) {
            System.out.println("""
                                  MENU
                Choose the operation you want to perform
                 1 Phone book
                 2 Messages
                 3 Chat
                 4 Call register
                 5 Tones
                 6 settings
                 7 Call divert
                 8 Games
                 9 Calculator
                 10 Reminder
                 11 Clock
                 12 Profiles
                 13 SIM services
                 """);
            int button = key.nextInt();

            switch (button) {
                case 1 -> PhoneBook.phonebook();
                case 2 -> Messages.messages();
                case 3 -> Chat.chat();
                case 4 -> CallRegister.callRegister();
                case 5 -> Tones.tones();
                case 6 -> Settings.settings();
                case 7 -> CallDivert.callDivert();
                case 8 -> Games.games();
                case 9 -> Calculator.calculator();
                case 10 -> Reminder.reminder();
                case 11 -> Clock.clock();
                case 12 -> Profile.profile();
                case 13 -> SIMServices.simServices();
                case 0 -> System.exit(0);
                default -> System.out.println("You entered an invalid number\n enter ' 0 ' to exit");
            }
        }
    }
}
