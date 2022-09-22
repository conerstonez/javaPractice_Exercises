package Practice.Notepad;/*
A program that converts minutes to years and days.
Assuming a year has 365 days.
*/
import java.util.Scanner;

public class YearAndDays{
	public static void main(String[] args){
		System.out.println("This program converts minutes to years");
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter values in minutes
		System.out.print("Enter minutes:");
		int minutes = input.nextInt();

		//Convert minutes to Years and Days
		int hour = minutes / 60;
		int day = hour / 24;
		int Year = day / 365;
		double Days = day % 365;

		//Display results
		System.out.println(minutes + " minutes is\n " + Year + " Years and " + Days + " Day(s)");

	}

}