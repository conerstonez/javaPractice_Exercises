package Practice.DeitelExercises.Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        int milesDriven = 0;
        int gallonsUsed = 0;
        int tripCounter = 0;
        double mileage = 0.0;

        System.out.println("This program calculates gallons used per miles; enter -1 to end.");
        System.out.print("Distance driven (miles): ");
        miles = input.nextInt();
        if (miles > 0) {
            System.out.print("Volume of fuel used (gallons): ");
            gallons = input.nextInt();
            mileage = (double) (miles / gallons);
            System.out.printf("%n%s%.2f%s%n%n",
                    "mileage = ", mileage, " miles per gallon");
            System.out.println("For subsequent trips this program calculates the gallons of fuel used per trip");
        }
        while (miles != -1) {
            milesDriven += miles;
            gallonsUsed +=  gallons;
            if (milesDriven <= 0) {
                System.out.print("Try again :-)");
                break;
            }
            else {
                System.out.printf("%s%d%s%d%s%n",
                        "For this trip you used ", gallons, " gallons to travel ", miles, " miles");
                System.out.println("Next trip; ");
                System.out.print("Distance driven (miles): ");
                miles = input.nextInt();
                gallons = (int) (miles / mileage);

                tripCounter++;
            }
        }
        if (tripCounter == 0) {
            System.out.printf("%n%s",
                    "no travel records");
        }
        else {
            System.out.println("@ " + mileage + " miles per gallon;");
            System.out.println("you have used " + gallonsUsed + " gallons to travel " + milesDriven + " miles");
        }
        System.out.println();
    }
}
