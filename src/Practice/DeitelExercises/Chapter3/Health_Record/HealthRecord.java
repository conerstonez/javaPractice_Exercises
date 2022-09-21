package Practice.DeitelExercises.Chapter3.Health_Record;

import Practice.DeitelExercises.Chapter3.Health_Record.HealthProfile;

import java.util.Scanner;

public class HealthRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HealthProfile profile = new HealthProfile();
        double weight = profile.getWeight();
        double height = profile.getHeight() * 0.3048;
        String s = null;
        int mhr = 0;

        System.out.println("NAME");
        System.out.print("Enter your First name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter your Last name: ");
        String name2 = sc.nextLine();
        profile.setName(name1, name2);
        System.out.println("Date of Birth");
        System.out.print("day -dd- : ");
        int day = sc.nextInt();
        System.out.print("month -mm- : ");
        int month = sc.nextInt();
        System.out.print("year -yyyy- : ");
        int year = sc.nextInt();
        profile.setDateOfBirth(day, month, year);
        System.out.print("Enter your height(inches): ");
        height = sc.nextDouble();
        profile.setHeight(height);
        System.out.print("Enter your weight(kg): ");
        weight = sc.nextDouble();
        profile.setWeight(weight);

            double index = (weight / Math.pow(height, 2));
            if (index < 18.5) s = "Underweight";
            else if (index >= 18.5 && index <= 24.9) s = "Normal";
            else if (index >= 25 && index <= 29.9) s = "Overweight";
            else if (index >= 30 ) s = "Obese";

            mhr = (220 - profile.getAge());
            double target1 = mhr * 0.5;
            double target2 = mhr * 0.85;

        System.out.println("\nYOUR DETAILS\n");
        System.out.println("Name: " + profile.getName());
        System.out.println("D-O-B: " + profile.getDateOfBirth());
        System.out.println("Age: " + profile.getAge());
        System.out.println("Height: " + profile.getHeight() + "in");
        System.out.println("Weight: " + profile.getWeight() + "kg");
        System.out.printf("%s%.3f(%s)%n","bmi: ", index, s);
        System.out.println("Maximum Heart rate: " + mhr);
        System.out.println("Target Heart Rate: " + target1 + " - " + target2);



    }
}
