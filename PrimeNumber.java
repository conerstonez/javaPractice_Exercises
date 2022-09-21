package Practice.Assignments;

import java.util.*;
import java.lang.*;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("This program checks if the number entered is a prime number");
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("INVALID NUMBER!");
        }
        else if (number > 0){
            if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println("PRIME NUMBER!");
            }
            else {
                System.out.println("Number entered is NOT a prime number");
            }
        }
    }
}
