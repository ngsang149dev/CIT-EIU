package Week3;

import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bankBalance = sc.nextDouble();
        int chequeNumber = sc.nextInt();
        double chequePay = 0.0;
        double monhtlyPay = 0.0;
        double total = 0;
        if (bankBalance < 500) {
            monhtlyPay = 12.00;
            chequePay= chequeNumber * 0.2;
        } else if (bankBalance <= 1999) {
            monhtlyPay = 7.5;
            chequePay= chequeNumber * 0.2;
        } else if (bankBalance <= 4999) {
            monhtlyPay = 5.00;
            chequePay= chequeNumber * 0.1;
        } 
        total = monhtlyPay + chequePay;
        System.out.println(total);
    }
}
// Submitted