package Practice;

import java.util.Scanner;

public class SwitchStatementTutorial {
    public static void main(String[] args) {
        try (Scanner sc  = new Scanner(System.in)) {
            System.out.println("Enter an input");
            int week = sc.nextInt();
            String name;
            switch (week) {
                case 1:
                    name = "Monday";
                    break;
                case 2:
                    name = "Tuesday";
                    break;
                case 3:
                    name = "Wednesday";
                    break;
                case 4:
                    name = "Thursday";
                    break;
                case 5:
                    name = "Friday";
                    break;
                case 6:
                    name = "Saturday";
                    break;
                case 7:
                    name = "Sunday";
                    break;
                default:
                    name = "Invalid Input";
                    break;
            }
            System.out.println(name);
        }
    }
}
