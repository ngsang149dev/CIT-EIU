package Voucher;

import java.util.Scanner;

public class Voucher2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int items = sc.nextInt();
        long sum = 0;
        double maxDiscount = 0;
        for (int i = 1; i <= items;i++) {
            double itemPrice = sc.nextDouble();
            double discount = itemPrice * 0.3;
            if (discount > 50_000) discount = 50_000;
            if (discount > maxDiscount) maxDiscount = discount;
            sum += itemPrice;
        } 
        long result = sum -(long) maxDiscount;
        System.out.println(result);
    }
}
