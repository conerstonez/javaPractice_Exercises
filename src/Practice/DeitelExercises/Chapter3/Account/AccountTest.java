package Practice.DeitelExercises.Chapter3.Account;

import Practice.Snacks.src.Practice.DeitelExercises.Chapter3.Account.Account;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("Bola Olu", 500.00);

		System.out.printf ("%n Account name: %s%n balance: %.3fNGN%n%n", 
			account.getName(), account.getBalance());

		Scanner input = new Scanner (System.in);

		System.out.print ("Enter deposit amount: ");
			double depositAmount = input.nextDouble ();
			account.deposit(depositAmount);
		
		System.out.printf ("%n Account name: %s%n balance: %.3fNGN%n%n",
			account.getName(), account.getBalance());
	
		System.out.print ("Enter amount to withdraw: ");
			double withdrawAmount = input.nextDouble ();
			account.withdraw(withdrawAmount);

		System.out.printf ("%n Account name: %s%n balance: %.3fNGN%n%n",
			account.getName(), account.getBalance());
	}

}