package Week3;

import java.util.Scanner;

public class EITAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        long taxableIncome = income - 9_000_000;
        if (taxableIncome <= 0) {
            System.out.println("0");
            return;
        }
        long[] incomeRange = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000,
                Long.MAX_VALUE };
        double[] rate = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
        double tax = 0.0;
        for (int i = 0; i < incomeRange.length - 1; i++) {

            double candidate = Math.min(taxableIncome, incomeRange[i + 1]);
            if (taxableIncome > incomeRange[i]) {
                tax += (candidate - incomeRange[i]) * rate[i];
            }
        }
        System.out.println(Math.round(tax));
    }
}
// Submitted