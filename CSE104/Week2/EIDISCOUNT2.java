package Week2;

import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var money = sc.nextDouble();
        var discount = 0.0;
        long[] rangeDiscounts = {0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE};
        double[] rates = {0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15};

        for (int i = 0; i < rangeDiscounts.length -1; i++) {
            double selection = Math.min(money, rangeDiscounts[i+1]);
            if (money > rangeDiscounts[i]) {
                discount += (selection - rangeDiscounts[i]) * rates[i];
            }
        }
        System.out.println((long) (money-discount));
    }
}
