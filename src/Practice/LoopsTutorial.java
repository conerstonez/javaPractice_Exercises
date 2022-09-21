package Practice;

import java.util.Scanner;

public class LoopsTutorial {
    ////for loop
//    private static Scanner sc;
//        public static void main(String[] args) {
//            int num, i, even = 0, odd = 0;
//            sc = new Scanner(System.in);
//
//            System.out.print(" Please Enter any Number : ");
//            num = sc.nextInt();
//
//            for (i = 1; i <= num; i++) {
//                if (i % 2 == 0) {
//                    even = even + i;
//                } else {
//                    odd = odd + i;
//                }
//            }
//            System.out.println("\n The Sum of even Numbers upto " + num + "  =  " + even);
//            System.out.println("\n The Sum of Odd Numbers upto " + num + "  =  " + odd);
//
//            int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for (int arr : array) {
//                System.out.println(arr);
//            }
//
//
//    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int num = sc.nextInt();
            int i = 2;
            boolean flag = false;
            while (i <= num)  {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
                ++i;
            }
            if (!flag)
                System.out.println(num + " is a prime Number");
            else
                 System.out.println(num + " is not a prime number");

        }
    }
}
