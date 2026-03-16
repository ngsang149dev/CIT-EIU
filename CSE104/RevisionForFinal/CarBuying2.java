package RevisionForFinal;

import java.util.Scanner;

public class CarBuying2 {
    static Scanner sc = new Scanner(System.in);
    static double oldCarPrice;
    static double newCarPrice;
    static double downPaymentRate;
    static int months;
    static int approriateMonth;
    static double monthlyDepreciationRate;

    public static void main(String[] args) {
        oldCarPrice = sc.nextDouble();
        newCarPrice = sc.nextDouble();
        downPaymentRate = sc.nextDouble() / 100;
        months = sc.nextInt();
        approriateMonth = sc.nextInt();
        monthlyDepreciationRate = sc.nextDouble() / 100;
        double annualInterestRate = findAnnualInterestRate();
        System.out.printf("%.4f", annualInterestRate);
    }

    public static boolean canAfford(double annualInterestRate) {
        double loan = oldCarPrice * (1 - downPaymentRate);
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = calculateMonthlyPayment(loan, months,monthlyInterestRate);
        
        double currentDebt = loan;
        double currentCarValue = oldCarPrice * 0.9;
        for (int i = 0;  i< approriateMonth-1; i++) {
            double interest = currentDebt * monthlyInterestRate;
            currentDebt = currentDebt + interest - monthlyPayment;
            currentCarValue *= (1 - monthlyDepreciationRate);
        }
        double remainingMoney = currentCarValue - currentDebt;
        double moneyNeed = newCarPrice * downPaymentRate;
        return remainingMoney >= moneyNeed;
    }

    public static double calculateMonthlyPayment(double X, int n, double r) {
        if (r==0) return X / n;
        double R = 1 + r;
        return ((X * Math.pow(R, n) ) * (R - 1)) / (Math.pow(R, n) - 1);
    }


    public static double findAnnualInterestRate() {
        double low = 0;
        double high = 1;
        final double EPS = 1e-10;
        double ans = 0;
        while (low + EPS < high) {
            double mid = low + (high - low) /2;
            if (canAfford(mid)) {
                ans = mid;
                low = mid;
            }
            else high = mid;
        }
        return ans;
    }
}
