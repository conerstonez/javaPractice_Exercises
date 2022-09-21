package Practice.Assignments;

public class Asteriks {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j =1; j <= i; j++) {
                System.out.printf("%2s", "x");
            }
            System.out.println();
        }

    }
}