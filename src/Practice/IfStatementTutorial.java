package Practice;

import java.util.Scanner;

public class IfStatementTutorial {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("Enter the first number : ");
            int num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Number is positive.");
            } else {
                System.out.println("The number is negative.");
            }
        }
    }
}
