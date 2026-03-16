package Week4;

import java.util.Scanner;

public class EIGROSS2BS {
    static Scanner sc = new Scanner(System.in);
    static final long[] incomeLadder = {
            0L, 5_000_000L, 10_000_000L, 18_000_000L, 32_000_000L, 52_000_000L, 80_000_000L , Long.MAX_VALUE / 2
    };
    static final double[] rates = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
    static final long TAX_FREE_LIMIT = 11_000_000L;

    public static long calculateNet(long grossSalary) {
        long taxableIncome = grossSalary - TAX_FREE_LIMIT;
        if (taxableIncome <= 0) {
            return grossSalary;
        }
        double tax = 0;

        for (int i = 0; i < incomeLadder.length - 1; i++) {
            if (taxableIncome > incomeLadder[i]) {
                tax += (Math.min(taxableIncome, incomeLadder[i + 1]) - incomeLadder[i]) * rates[i];
            }
        }

        long roundedTax = Math.round(tax);  
        return grossSalary - roundedTax ;
    }

    public static long findGross(long netSalary) {
        long low = netSalary;
        long high = 20_000_000_000L;

        if (low > high) {
            high = netSalary * 2;
        }

        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long currentNet = calculateNet(mid);

            if (currentNet >= netSalary) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long initNetSalary = sc.nextLong();
        System.out.println(findGross(initNetSalary));
    }
}
