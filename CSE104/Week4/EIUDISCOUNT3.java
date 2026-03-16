package Week4;

import java.util.Scanner;

public class EIUDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        double discount = 0;
        long[] rangeDiscounts = {0, 5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000, 900_000_000, Long.MAX_VALUE};
        double[] rates = {0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15};

        for (int i = 0; i < rangeDiscounts.length -1; i++) {
            double selection = Math.min(money, rangeDiscounts[i+1]);
            if (money > rangeDiscounts[i]) {
                discount += (selection - rangeDiscounts[i]) * rates[i];
            }
            else break;
        }
        long afterDiscount = money - (long)discount;
        for (int i =0 ; i <= 2; i++) {
            int action = sc.nextInt();
            if (action == 1) {
                afterDiscount -= afterDiscount * 0.02;
            }
        }
        System.out.println((long)afterDiscount);
    }
}
// Submitted