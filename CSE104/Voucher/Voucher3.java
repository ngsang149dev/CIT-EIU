package Voucher;

import java.util.Arrays;
import java.util.Scanner;

public class Voucher3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int items = sc.nextInt();
        int vouchers = sc.nextInt();
        int[] itemPrices = new int[items];
        for (int i = 0; i < itemPrices.length; i++) {
            itemPrices[i] = sc.nextInt();
        }
        Arrays.sort(itemPrices);
        double totalDiscount = 0;
        for (int i = itemPrices.length - 1; i >= 0; i--) {            
            if (vouchers > 0) {
                double discount = 0;
                discount = itemPrices[i] * 0.3;
                if (discount <= 50_000) {
                    totalDiscount += discount;
                }
                else totalDiscount += 50_000;
                vouchers--;
            }

        }
        double sum = 0;
        for (double i : itemPrices) {
            sum += i;
        }
        System.out.println(Math.round(sum - totalDiscount));
    }
}
