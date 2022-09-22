package Practice.DeitelExercises.Chapter4;

import java.util.Scanner;

public class Crypt {
    public static void main(String[] args) {
        Cryptography pin = new Cryptography();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 4 digit pin: ");
        pin.setPin(sc.nextInt());
        System.out.printf("Encryption: %n%s", pin.encrypt());
    }
}
