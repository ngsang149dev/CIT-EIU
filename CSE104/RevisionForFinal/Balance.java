package RevisionForFinal;

import java.util.Scanner;

public class Balance {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int months = sc.nextInt();
        double[] monthlySalaries = new double[months];
        for (int i = 0; i < monthlySalaries.length; i++) {
            monthlySalaries[i] = sc.nextDouble();
        }
        double monthlyExpenditure = sc.nextDouble();
        double interestRate = sc.nextDouble() / 12 / 100;
        double inflationRate = sc.nextDouble() / 12 / 100;
        double total = 0;
        for (int i = 0; i < months; i++) {
            total += monthlySalaries[i];
            total -= monthlyExpenditure;
            monthlyExpenditure *= (1 + inflationRate);
            total *= (1 + interestRate);
        }

        for (int i = 0; i < months; i++) {
            total -= monthlyExpenditure;
            monthlyExpenditure *= 1 + inflationRate;
            total *= 1 + interestRate;
        }
        System.out.println(total > 0 ? Math.round(total) : 0);
    }

}
