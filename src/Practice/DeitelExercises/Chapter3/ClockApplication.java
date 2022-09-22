package Practice.DeitelExercises.Chapter3;

import Practice.DeitelExercises.Chapter3.Clock;

import java.util.Scanner;

public class ClockApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = new Clock(0,0,0);
        System.out.print("Hours: ");
        clock.setHour(sc.nextInt());
        System.out.print("Minutes: ");
        clock.setMinutes(sc.nextInt());
        System.out.print("Seconds: ");
        clock.setSeconds(sc.nextInt());
        System.out.println(clock.displayTime());
    }
}
