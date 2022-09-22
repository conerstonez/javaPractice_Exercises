package Practice.DeitelExercises.Chapter4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesCommissionCalculator scc = new SalesCommissionCalculator(null, 0.0, 0.0);
        int i = 1;
        double s = 0;
        double total = 0.0;
        System.out.print("Employee name: ");
        scc.setName(sc.nextLine());
        System.out.println("Enter sales for the week, enter -1 quit");
        System.out.printf("%s              %s%n", "Item", "Value");
        while (s != -1) {
            System.out.printf("%d                  $", i);
            s = sc.nextDouble();
            total += s;
            scc.setSale(total);
            i++;
        }
        System.out.println("WAGE");
        System.out.printf("%n    %s        %s          %s", "Name", "Sales", "Commission");
        System.out.printf("%n    %s        $%.2f        $%.2f", scc.getName(), scc.getSale(), scc.getCommission());


    }
}
