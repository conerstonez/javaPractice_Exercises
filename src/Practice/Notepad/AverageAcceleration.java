package Practice.Notepad;/*
A program to calcuate average acceleration from the given  values;
initial velocity, final velocity and time taken
*/
import java.util.Scanner;

public class AverageAcceleration{
	public static void main(String[] args){
		System.out.printf("find the average acceleration (a)\n", "using the formula:  [a = (v1 -v0)/t]");
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
	
		//prompt user to enter data 
		System.out.println("given the initial 'velocity(vo)' in 'meter per second' to be:");
		double v0 = input.nextDouble();

		System.out.println("given the final 'velocity(v1)' in 'meter per second' to be:");
		double v1 = input.nextDouble();

		System.out.println("and the 'time(t)' of travel in 'seconds' is:");
		double t = input.nextDouble();

		//Calculate the average acceleratio
		double a = (v1 - v0) / t;

		//Display result
		System.out.println("average acceleration(a)\n= " + a + " meter per second square");
	
	}

}