package Week2;

import java.util.*;

class EIDISCOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();

        long[] moneyRange = { 0, 2_000_000, 10_000_000, 50_000_000, 100_000_000, 200_000_000, 500_000_000,
                Long.MAX_VALUE };
        double[] rates = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };

        double discount =0;

        for (int i = 0; i < moneyRange.length - 1; i++) {
            if (money > moneyRange[i]) {
                discount += (Math.min(money, moneyRange[i + 1]) - moneyRange[i]) * rates[i];
            }
        }
        System.out.println((long)(money - discount));
    }
}