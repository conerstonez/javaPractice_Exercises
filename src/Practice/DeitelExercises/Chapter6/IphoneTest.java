package Practice.DeitelExercises.Chapter6;
import Practice.DeitelExercises.Chapter6.Iphone;

import java.util.Scanner;
public class IphoneTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Iphone myPhone = new Iphone("gold", 9_000);

        System.out.printf("%s$%,.1f%n%s%s%n",
                "This Iphone costs ", Iphone.getPrice(), "Default colour is: ", myPhone.getColour());

        System.out.print("specify your choice colour: ");
        String theColour = input.nextLine();
        myPhone.setColour(theColour);

        System.out.printf("%s%s%n%s$%,.1f%n",
                "Your new phone colour is: ", myPhone.getColour(), "Price: ", Iphone.getPrice());





    }

}