package Practice.Assignments;

import java.util.*;
import java.lang.*;

public class naturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        int total = 0;
        int count = 1;
        while (count <= number) {
            total += count;
            ++count;
        }
        System.out.println("The sum of the first " + number + " numbers is: " + total);
    }
}
