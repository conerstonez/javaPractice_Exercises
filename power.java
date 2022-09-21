package Practice.Assignments;

import java.lang.*;
import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number base: ");
        int base = number.nextInt();
        System.out.print("Enter an exponential number: " );
        int power = number.nextInt();
        int result = 1;

        for(int count = 1; count <= power; count++){
            result *= base;
        }
        System.out.print("The value of " + base + " raised to the power of " + power + " = " +  result);
    }
}
