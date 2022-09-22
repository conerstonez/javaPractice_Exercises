package Practice.DeitelExercises.Chapter6;
import java.lang.*;
public class Iphone {
    private String colour; // Instance variable
    private static double price; // Static Field
    public Iphone (String colour, double price){
        this.colour = colour;
        Iphone.price = price;
    }
        public void setColour(String colour){
           this.colour = colour;
        }
        public static void setPrice (double price) {
            Iphone.price = price;
        }
        public String getColour(){
            return colour;
        }
        public static double getPrice(){
            return price;
        }
}
