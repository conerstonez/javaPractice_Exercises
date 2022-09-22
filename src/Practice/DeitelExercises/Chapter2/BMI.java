package Practice.DeitelExercises.Chapter2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);
        System.out.println("""
                BMI Categories:
                Underweight = <18.5
                Normal weight = 18.5–24.9
                Overweight = 25–29.9
                Obesity = BMI of 30 or greater""");
        System.out.print("\nEnter your weight(kg): ");
        double weight = bmi.nextDouble();
        System.out.print("Enter your height(foot): ");
        double h = bmi.nextDouble();
        double height = h * 0.3048;
        double index = weight / Math.pow(height, 2);
        System.out.printf("%nweight(Pounds): %.1flb%nheight(inches): %.1fin%nBMI : %.1f   -   "
                , weight, height, index);
        if (index < 18.5) System.out.print("Underweight");
        else if (index >= 18.5 && index <= 24.9) System.out.print("Normal");
        else if (index >= 25 && index <= 29.9) System.out.print("Overweight");
        else if (index >= 30 ) System.out.print("Obese");
    }
}
