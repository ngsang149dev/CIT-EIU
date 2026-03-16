package RevisionForFinal;

import java.util.Scanner;

public class EIUFF {
    static Scanner sc = new Scanner(System.in);

    public static double calculateMonthlyBalance(double money, int months, double withdrawMoney,
            double monthlyInterestRate, double inflationRate) {
        double balance = money;
        for (int i = 0; i < months - 1; i++) {
            balance *= (1 + monthlyInterestRate);
            balance -= withdrawMoney;
            withdrawMoney *= (1 + inflationRate);
        }
        return balance;
    }

    public static double findAppropriateMoney(double monthlyInterestRate, double inflationRate, double withdrawMoney,
                                              int months) {
        double low = 0;
        double high = 1e18;
        double ans = high;
        for (int i = 0; i <= 100; i++) {
            double mid = low + (high - low) / 2;
            double currentBalance = calculateMonthlyBalance(mid, months, withdrawMoney, monthlyInterestRate,
                    inflationRate);
            if (currentBalance >= 0) {
                ans = mid;
                high = mid;
            } else {
                low = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        double monthlyInterestRate = sc.nextDouble() / 100;
        double inflationRate = sc.nextDouble()/ 100;
        double withdrawMoney = sc.nextDouble();
        int months = sc.nextInt();
        double result = findAppropriateMoney(monthlyInterestRate, inflationRate, withdrawMoney, months);
        System.out.printf("%.4f", result);
    }
}
