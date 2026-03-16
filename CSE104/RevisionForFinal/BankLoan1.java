package RevisionForFinal;

import java.util.Scanner;

public class BankLoan1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double productPrice = sc.nextDouble();
        double monthlyPay = sc.nextDouble();
        double rate = sc.nextDouble() / 100 / 12;

        double result = findMonthV2(productPrice, monthlyPay, rate);
        System.out.println((int) result);
    }

    public static double findMonthV1(double productPrice, double monthlyPay, double rate) {
        double month = Math.ceil((Math.log(monthlyPay / (monthlyPay - productPrice * rate)) / Math.log(1 + rate)));
        return month;
    }

    public static double findMonthV2(double productPrice, double monthlyPay, double rate) {
        double currentDebt = productPrice;
        int month = 0;
        while (currentDebt > 0) {
            double monthlyInterest = currentDebt * rate;
            currentDebt += monthlyInterest;
            currentDebt -= monthlyPay;
            month++;
        }
        return month;
    }
}
