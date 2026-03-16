package Week4;

import java.util.Scanner;


public class EIGROSS2NoBS {
    static Scanner sc = new Scanner(System.in);
    static final long[] incomeLadder = {
            0L, 5_000_000L, 10_000_000L, 18_000_000L, 32_000_000L, 52_000_000L, 80_000_000L, Long.MAX_VALUE / 2
    };
    static final double[] rates = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };

    public static void main(String[] args) {
        double netSalary = sc.nextDouble();
        double taxableIncome = netSalary - 11_000_000;
        for (int i = 0; i < incomeLadder.length;i++) {
            if (taxableIncome > incomeLadder[i]) {
                taxableIncome += Math.min((taxableIncome- incomeLadder[i])/ (1-rates[i]), incomeLadder[i+1]-incomeLadder[i])* rates[i]; 
                /*Learn by heart */
            }
        }
        System.out.println(Math.round(taxableIncome+11_000_000));
    }
}
