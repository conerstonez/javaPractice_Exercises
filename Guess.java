package Practice.Assignments;

import java.util.*;
import java.lang.*;

public class Guess {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Random random = new Random();

        int value = 1 + random.nextInt(10);
        int guess = 1;

        while (guess > 0) {
            System.out.print("guess my number (range: 1 - 10): ");
            int guessNumber = number.nextInt();

            if (guessNumber < value) {
                System.out.println("Too Low! Try Again");
            }
            else if(guessNumber > value) {
                System.out.println("Too High! Try Again");
            }
            else {
                System.out.println("Perfect");break;
            }
            guess++;
        }
    }
}
