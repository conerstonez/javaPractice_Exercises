package Practice.Assignments;

import java.lang.*;
import java.util.*;

public class StudentGrade {
    //(Student Grades) A group of five students earned the following grades:
    // Student 1, ‘A’; student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’.
    // Write an application that reads a series of pairs of numbers as follows:
    //a) student name
    //b) student letter grade
    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);

        int distinction = 0;
        int merit = 0;
        int credit = 0;
        int pass = 0;
        int fail = 0;
        int count;
        int grade = 0;


        for (count = 1; count <= 5; ++count) {
//            System.out.println("Enter Student's name: ");
//            String student1 = details.nextLine();
//            String student2 = details.nextLine();
//            String student3 = details.nextLine();
//            String student4 = details.nextLine();
//            String student5 = details.nextLine();

            System.out.println("Enter Student's' grade: ");
            grade = details.nextInt();

            switch (grade / 10) {
                case 10, 9 -> ++distinction;
                case 8, 7 -> ++merit;
                case 6 -> ++credit;
                case 5 -> ++pass;
                default -> ++fail;
            }
        }
        if (count != 0){
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students per grade",
                    "A = ", distinction,
                    "B =", merit,
                    "C = ", credit,
                    "D = ", pass,
                    "F = ", fail);
        }
        else {
            System.out.print("no grades were entered.");
        }
    }
}
