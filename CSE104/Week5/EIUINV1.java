package Week5;

import java.util.Scanner;

public class EIUINV1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double expectedMoney = sc.nextDouble();
        double[] deposits = new double[12];
        for (int i = 0; i < deposits.length; i++) {
            deposits[i] = sc.nextDouble();
        }
        double result = findRate(deposits, expectedMoney);
        System.out.printf("%.3f", result);
    }

    public static double calculateInterest(double rate, double[] deposits) {
        double totalInterest = 0;
        double R = 1 + rate;
        for (int i = 0; i < deposits.length;i++) {
            if (deposits[i] > 0 ) {
                totalInterest += deposits[i] * Math.pow(R,11-i);
            } 
        }
        return totalInterest;
    }

    public static double findRate(double[] deposits, double expectedMoney) {
        double low = 0;
        double high = 1;
        double ans = high;

        for (int i = 0; i <= 100;i++) {
            double mid = low + (high - low) /2;
            double currentInterest = calculateInterest(mid, deposits);
            if (currentInterest >= expectedMoney) {
                high = mid;
                ans = mid;
            }else {
                low = mid;
            }
        }
        return ans;
    }

}
