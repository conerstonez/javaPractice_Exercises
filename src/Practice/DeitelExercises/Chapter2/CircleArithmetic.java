package Practice.DeitelExercises.Chapter2;

import java.lang.*;
import java.util.*;

public class CircleArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = input.nextInt();
        int D = 2 * r;
        double C =  2 * Math.PI * r;
        double A =  Math.PI * (r * r);
        System.out.printf("if radius of the circle is:  %dm%n ", r);
        System.out.printf("the diameter = %dm%n the circumference = %.3fm%n the area = %.2fm^2%n ", D, C, A);
    }
}
