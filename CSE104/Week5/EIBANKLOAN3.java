package Week5;

import java.util.Scanner;

public class EIBANKLOAN3 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static String calculateLoanBalance(double productPrice, double maxMonthlyPay, int months, double monthlyRate,
            double penaltyFee) {
        double debt = productPrice;
        for (int i = 1; i <= months; i++) {
            double debtPlan = productPrice - (productPrice / months) * i;
            double P1 = Math.max(debt - debtPlan, 0);

            double interest = monthlyRate * debt;
            double P2 = (maxMonthlyPay - P1 - interest) / (1 + penaltyFee);

            debt -= P1 + P2;
            if (debt <= 0) {
                sb.append(i + " " + 0);
                break;
            }
            sb.append(i + " " + Math.round(debt) + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        double productPrice = sc.nextDouble();
        double maxMonthlyPay = sc.nextDouble();
        int months = sc.nextInt();
        double monthlyRate = sc.nextDouble() / 100 / 12;
        double penaltyFee = sc.nextDouble() / 100;
        String result = calculateLoanBalance(productPrice, maxMonthlyPay, months, monthlyRate, penaltyFee);
        System.out.println(result);
    }
}