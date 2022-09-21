package Practice.Assignments;

import java.util.*;
import java.lang.*;

public class barChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number within the range of 1 and 30: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();


        for (int count = 1; count <= number1; count++){
            System.out.print("* ");
        }
        System.out.println();
        for (int count = 1; count <= number2; count++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int count = 1; count <= number3; count++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int count = 1; count <= number4; count++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int count = 1; count <= number5; count++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
