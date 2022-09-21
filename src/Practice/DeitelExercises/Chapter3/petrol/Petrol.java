package Practice.DeitelExercises.Chapter3.petrol;

import java.util.Scanner;

public class Petrol {
	public static void main(String[] args) {
		PetrolPurchase Petrol = new PetrolPurchase ("Yaba", "PMS", 169.50, 1.5);

		System.out.printf (" location: %s%n petrolType: %s%n pumpPrice: %.2fNGN%n discount: %.2fpercent %n%n", 
			Petrol.getLocation(), Petrol.getPetrolType(), Petrol.getPricePerLitre(), Petrol.getPercentageDiscount());
		Scanner input = new Scanner (System.in);

		System.out.print("quantity to be purchased (litres): ");
		int quantity = input.nextInt ();
		Petrol.setQuantity(quantity);
		
		System.out.printf ("%n%d litres of %s is %.2fNGN @ %.2fpercent %n%n",
			Petrol.getQuantity(), Petrol.getPetrolType(), Petrol.getPurchaseAmount(), Petrol.getPercentageDiscount());
	}
} 