package Week5;

import java.util.Scanner;

public class EIPURCHASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long productPrice = sc.nextLong();
        int installmentMonths = sc.nextInt();
        long prepaidAmount = sc.nextLong();
        long monthlyPayment = sc.nextLong(); /* = G: Monthly payment amount */  
        long X = productPrice - prepaidAmount; /* Initial loan amount (remaining debt) */

        double monthlyRate = findInterestRate(X, monthlyPayment, installmentMonths);
        System.out.printf("%.7f", monthlyRate );
        /* Call Binary Search Method */
    }

    public static double calculateRemainingDebt(long X, long G, int month, double rate) {
        double R = rate + 1.0;
        double initalDebtCompounded /* X*R^n */ = X * Math.pow(R, month);
        double paymentsCompounded /* G*(R^n-1)/r */ = (G * (Math.pow(R, month) - 1)) / rate;
        return initalDebtCompounded - paymentsCompounded;
    }

    /* Binary Search Method */
    public static double findInterestRate(long X, long G, int month) {
        double low = 0;
        double high = 1.0;
        final double epsilon = 1e-10;

        while (low + epsilon < high) {
            double midRate = low + (high - low) / 2;
            double currentDebt = calculateRemainingDebt(X, G, month, midRate);
            if (currentDebt < 0) {
                low = midRate;
            } else
                high = midRate;
        }
        return high; // either hight or midRate or low
    }
}
// Submitted