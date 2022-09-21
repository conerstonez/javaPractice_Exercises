package Practice.Assignments;

import java.util.*;
import java.lang.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int count = 1;
        do {
            System.out.print("Enter the first number: ");
            int number1 = number.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = number.nextInt();
            int sum = number1 + number2;
            System.out.println("sum = " + sum);

            System.out.print("Enter '0' to continue or any number to exit: ");
            int exit = number.nextInt();
            if (exit != 0) {
                break;
            }
            else {
                continue;
            }
        }
        while (count > 0);
        System.out.println();
    }
}
