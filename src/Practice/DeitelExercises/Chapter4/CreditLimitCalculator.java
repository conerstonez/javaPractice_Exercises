package Practice.DeitelExercises.Chapter4;

import java.security.SecureRandom;
import java.util.Random;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        SecureRandom acc = new SecureRandom();
        long accountNumber =1000000001 + acc.nextLong(1000000000);
        System.out.println(accountNumber);
    }
}
