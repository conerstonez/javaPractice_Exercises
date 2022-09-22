package Practice.Notepad;/*
A program that reads a number in feet, converts to meters
and displays the result. One foot is 0.305 meter.
*/
import java.util.Scanner;

public class FeetToMeter{
	public static void main(String[] args) {
		System.out.println("1 foot = 0.305 meter");

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create constant value
		final double METERS_PER_FOOT = 0.305;

		// Prompt user to enter a number in feet
		System.out.print("Enter 'value in feet': ");
		double feet = input.nextDouble();

		// Convert feet into meters
		double meters = feet * METERS_PER_FOOT;

		// Display results
		System.out.println(feet + " feet is " + meters + " meter(s)");
	}
}