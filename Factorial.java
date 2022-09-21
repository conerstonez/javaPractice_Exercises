package Practice.Assignments;

import java.util.*;
import java.lang.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.print("Enter number: ");

        long number = digit.nextLong();
        long product = 1;
        long count = 1;

        while (count <= number) {
            product *= count;
            count++;
        }
        System.out.printf("%n%d%s%s%d",
                number,"!"," = ", product);
    }
}
