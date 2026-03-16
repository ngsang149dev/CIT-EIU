package Week4;

import java.util.Scanner;

public class EIUCHRMS {

    static double[] priceLadder = { 0, 2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000,
            200_000_000,
            Long.MAX_VALUE };
    static double[] rates = {
            0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1
    };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bills = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= bills; i++) {
            double valuePerBill = sc.nextDouble();
            for (int j = 0; j < priceLadder.length; j++) {
                if (valuePerBill > priceLadder[j] && valuePerBill <= priceLadder[j + 1]) {
                    sum += valuePerBill - (valuePerBill * rates[j]);
                    break;
                }

            }
        }
        System.out.println((long)sum);
    }

}
// Submitted
