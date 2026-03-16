package Week5;

import java.util.Scanner;

public class EIUPURCHASE3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double productPrice = sc.nextDouble();
        double initPrice = sc.nextDouble();
        int months = sc.nextInt();
        double rate = sc.nextDouble();
        double X = productPrice - initPrice;/*X means Principal */
        System.out.println(Math.floor(calculateMonthlyPayment(X, months, rate)));
    }

    public static double calculateMonthlyPayment(double principal, int months, double rate) {
        if (rate == 0) {
            return principal / months;
        }
        double R = rate + 1;
        return (principal * Math.pow(R, months) * rate) / (Math.pow(R, months) -1);
    }
}
// Submitted
