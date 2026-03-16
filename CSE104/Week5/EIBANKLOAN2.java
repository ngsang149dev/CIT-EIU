package Week5;

import java.util.Scanner;

public class EIBANKLOAN2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double productPrice = sc.nextDouble();
        double maxMonthlyPay = sc.nextDouble();
        double annualRate = sc.nextDouble();
        double rate = annualRate / 100 / 12;
        System.out.println(findPreciseMonth(productPrice, maxMonthlyPay, rate));
    }

    public static int findPreciseMonth(double productPrice, double maxMonthlyPay, double rate) {
        double currentDebt = productPrice;
        int month = 0;
        while (currentDebt > 0) {
            double interestThisMonth = currentDebt * rate;
            currentDebt+= interestThisMonth;
            currentDebt -=maxMonthlyPay;
            month++;
        }
        return month;
    }
}
// Submitted