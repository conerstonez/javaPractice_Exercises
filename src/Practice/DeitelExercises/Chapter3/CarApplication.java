package Practice.DeitelExercises.Chapter3;

import java.util.*;
import java.lang.*;

public class CarApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car1 = new Car("Toyota", "2002" , 1_600_300);
        Car car2 = new Car("Mazda", "2003", 1_504_000);

        System.out.printf("%s%n%s%s%n%s%,.2fNGN%n",
                car1.getCarModel(), "year of production: ", car1.getYearOfProduction(), "price: ", car1.getAmount());
        System.out.println();
        System.out.printf("%s%n%s%s%n%s%,.2fNGN%n",
                car2.getCarModel(), "year of production: ", car2.getYearOfProduction(), "price: ", car2.getAmount());
    }
}
