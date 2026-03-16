package Week3;

import java.util.Scanner;

public class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        double total = 0;
        int number = 0;
        for (int i = 1; i <= testcases; i++) {
            double bankBalance = sc.nextDouble();
            int chequeNumber = sc.nextInt();
            double monhtlyPay = 0;
            number += chequeNumber;
            double chequePay = 0.0;
            if (bankBalance < 500) {
                monhtlyPay = 12.00;
                chequePay = chequeNumber * 0.2;
            } else if (bankBalance <= 1999) {
                monhtlyPay = 7.5;
                chequePay = chequeNumber * 0.2;
            } else if (bankBalance <= 4999) {
                monhtlyPay = 5.00;
                chequePay = chequeNumber * 0.1;
            }
            total += monhtlyPay + chequePay;
        }
        System.out.print(total / number);
    }
}
// Submitted