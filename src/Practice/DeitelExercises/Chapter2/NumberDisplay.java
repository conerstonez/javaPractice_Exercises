package Practice.DeitelExercises.Chapter2;

import java.util.Scanner;

public class NumberDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 figures seperated by space: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

       // -- using nested static method (Math.min, Math.max)  to find the maximum and minimum values;
        int min = Math.min(Math.min(Math.min(Math.min(a,b), c), d), e);
        int max = Math.max(Math.max(Math.max(Math.max(a,b), c), d), e);
        System.out.printf(" the minimum value is: %d%n and the maximum value is: %d%n", min, max);

        // -- using selective statement to find the minimum and maximum values;
//        if (a < b && a < c && a < d && a < e) {
//            System.out.println("the smallest number is: " + a);
//        }
//        if (b < a && b < c && b < d && b < e) {
//            System.out.println("the smallest number is: " + b);
//        }
//        if (c < a && c < b && c < d && c < e) {
//            System.out.println("the smallest number is: " + c);
//        }
//        if (d < a && d < c && d < b && d < e) {
//            System.out.println("the smallest number is: " + d);
//        }
//        if (e < a && e < c && e < b && e < d) {
//            System.out.println("the smallest number is: " + e);
//        }
//        if (a > b && a > c && a > d && a > e) {
//            System.out.println("the largest number is: " + a);
//        }
//        if (b > a && b > c && b > d && b > e) {
//            System.out.println("the largest number is: " + b);
//        }
//        if (c > a && c > b && c > d && c > e) {
//            System.out.println("the largest number is: " + c);
//        }
//        if (d > a && d > c && d > b && d > e) {
//            System.out.println("the largest number is: " + d);
//        }
//        if (e > a && e > c && e > b && e > d) {
//            System.out.println("the largest number is: " + e);
//        }

        ////////////////////////////////////
//        System.out.print("Enter a number: ");
//        int nr = input.nextInt();
//
//        int nr1 = nr / 10000;
//        int nr2 = (nr % 10000) / 1000;
//        int nr3 = ((nr % 10000) % 1000) / 100;
//        int nr4 = (((nr % 10000) % 1000) % 100) / 10;
//        int nr5 = (((nr % 10000) % 1000) % 100) % 10;
//
//        System.out.printf("%d%s%d%s%d%s%d%s%d%n", nr1, "   ", nr2, "   ", nr3, "   ", nr4, "   ", nr5);

        ////////////////////////////////////////////
//        int c = (int) Math.pow(nr, 2);
//        int d = (int) Math.pow(nr, 3);
//        System.out.printf("%s    %s    %s    %n", "number", "square", "cube");
//        System.out.printf("    %d        %d        %d", nr, c ,d);
    }
}
