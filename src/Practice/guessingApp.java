package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;


public class guessingApp {

public static void main(String[] args) { play(); }

    public static void play(){
        int value = 45;

        Scanner input = new Scanner(System.in);

        for(int count = 1; count <= 3; count++){

            System.out.println("Guess my number: ");
            int guess = input.nextInt();

            if (guess < value) { System.out.println("Too Low! Try Again");}

            else if(guess > value){System.out.println("Too High! Try Again"); }

            else { System.out.println("Perfect");break; }
        }

    }

}



