package Practice.DeitelExercises.Chapter3.Health_Record;

import java.time.temporal.ValueRange;

public class HealthProfile {
    enum Gender {MALE, FEMALE}
    private String name;
    private String date;
    private int age;
    private double height;
    private double weight;
    public void setName(String name1, String name2) {
        name = name1 + " " + name2;
    }
    public void setDateOfBirth(int day, int month, int year) {
        if (day > 0 && day <= 31 && month > 0 && month <= 12) {
            if (month == 4 || month == 6 || month == 9 || month == 11 && day == 30) {
                    date = year + "-" + month + "-" + day;
            }
        } else { System.out.println("Invalid date"); }
        age = 2022 - year;
    }
    public void setHeight(double height) {
        if (height > 0.0) {
            this.height = height;
        }
    }
    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        }
    }
    public String getName() {
        return name;
    }
    public String getDateOfBirth() {
        return date;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
}
