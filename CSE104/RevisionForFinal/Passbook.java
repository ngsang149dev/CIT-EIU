package RevisionForFinal;

import java.util.Scanner;

public class Passbook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double X = sc.nextDouble();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100;
        double r2 = sc.nextDouble() / 100;
        double result = Math.max(X, calculateY(r1, r2, n, m, X));
        System.out.println(Math.round(result));
    }

    public static double calculateX(double X, double r1, int n) {
        return X * (1 + (r1 / 12 * n));
    }

    public static double calculateGrowthFactor(double r2, int months) {
        int years = months / 12;
        int remainingMonths = months % 12;
        double totalGrowthFactor = 1;
        totalGrowthFactor = Math.pow((1 + r2), years);
        if (remainingMonths > 0) {
            totalGrowthFactor *= (1 + r2 / 12 * remainingMonths);
        }
        return totalGrowthFactor;
    }

    public static double calculateY(double r1, double r2, int n, int m, double X) {
        return calculateX(X, r1, n) / calculateGrowthFactor(r2, n - m);
    }
}
