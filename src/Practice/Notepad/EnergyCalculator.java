package Practice.Notepad;/*
A program that calculates the energy needed to heat water from an 
initial temperature to a final temperature using the formular;
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules. 
*/
import java.util.Scanner;

public class EnergyCalculator{
	public static void main(String[] args) {

		// Create new Scanner object.
		Scanner input = new Scanner(System.in);	


		// Prompt the user to enter the amount of water in kilograms.
		System.out.print("Enter 'amount of water(kg)': ");
		double kilograms = input.nextDouble();
		
		// Prompt the user to enter the initial temperature.
		System.out.print("Enter 'initial temperature(celcius)': ");
		double initialTemperature = input.nextDouble();
		
		// Prompt the user to enter the final temperature.
		System.out.print("Enter 'final temperature(celcius)': ");
		double finalTemperature = input.nextDouble();

		// Calculate the energy
		double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

		// Display result
		System.out.println("The energy needed is " + energy + "joules");
	}
}