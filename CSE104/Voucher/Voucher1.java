package Voucher;

import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long money = sc.nextLong();
        double discount = money * 0.3;
        if (discount > 50_000) {
            discount = 50_000;
        }
        System.out.print(money - (long) discount);
    }
}