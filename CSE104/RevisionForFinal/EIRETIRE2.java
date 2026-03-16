package RevisionForFinal;

import java.util.Scanner;

public class EIRETIRE2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int workingMonths = sc.nextInt();
        double annualInterestRate = sc.nextDouble() / 100 / 12;
        double annualInflationRate = sc.nextDouble() / 100 / 12;
        double[] salaries = new double[workingMonths];
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = sc.nextDouble();
        }
        double result = findMonthlySpending(workingMonths, salaries, annualInterestRate, annualInflationRate);
        System.out.println((long) result);
    }

    public static double findMonthlySpending(int workingMonths, double[] salaries, double annualInterestRate,
            double annualInflationRate) {
        double low = 0;
        double high = Long.MAX_VALUE / 2;
        double ans = 0;
        for (int i = 0; i <= 100; i++) {
            double mid = low + (high - low) / 2;
            if (isSastified(workingMonths, salaries, mid, annualInterestRate, annualInflationRate)) {
                low = mid;
                ans = mid;
            } else {
                high = mid;
            }
        }
        return ans;
    }

    public static boolean isSastified(int workingMonths, double[] salaries, double monthlySpending,
            double annualInterestRate, double annualInflationRate) {
        double balance = 0;
        for (int i = 0; i < 1200; i++) {
            if (i < workingMonths) {
                balance += salaries[i];
            }
            balance -= monthlySpending;
            balance *= 1 + annualInterestRate;
            if (balance < 0) {
                return false;
            }
            monthlySpending *= 1 + (annualInflationRate );
        }
        return true;
    }
}