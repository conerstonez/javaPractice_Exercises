package Practice.DeitelExercises.Chapter5;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to compare: ");
        int i = sc.nextInt();
        int m = 0;
        int j = 100;
        System.out.println("\nEnter numbers: ");
        while (i > 0) {
            int n = sc.nextInt();
            m = Math.max(m, n);
            j = Math.min(n, j);
            --i;
        }
        System.out.println("Minimum number is: " + j);
        System.out.println("Maximum number is: " + m);
        int s = m + j;
        System.out.println("Sum of the max and min numbers: " + s);
    }
}
