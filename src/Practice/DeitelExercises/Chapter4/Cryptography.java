package Practice.DeitelExercises.Chapter4;

public class Cryptography {
    private int pin;
    public void setPin(int pin){
        this.pin = pin;
    }
    public String encrypt(){
        int a = ((pin / 1000) + 7) % 10;
        int b = (((pin % 1000) / 100) + 7) % 10;
        int c = ((((pin % 1000) % 100) / 10) + 7) % 10;
        int d = ((((pin % 1000) % 100) % 10) + 7) % 10;

        return c + "" + d + "" + a + "" + b;

    }

}
