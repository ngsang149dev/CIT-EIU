package Week5;

import java.util.Scanner;

public class EIVINFASTBATERY {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double loanAmount = sc.nextDouble();
        double residualValue = sc.nextDouble();
        int months = sc.nextInt();
        double monthlyRate = sc.nextDouble() / 100;
        double result = calculateMonthyPayment(loanAmount, residualValue, months, monthlyRate);
        System.out.println(Math.round(result));
    }

    public static double calculateMonthyPayment(double loanAmount, double residualValue, int months, double monthlyRate) {
        double monthlyPayment = 0;
        if (monthlyRate == 0) {
            monthlyPayment = (loanAmount - residualValue) * months;
        }
        else {
            double R = monthlyRate + 1;
            monthlyPayment = ((loanAmount * Math.pow(R, months) - residualValue) * monthlyRate) / (Math.pow(R, months) - 1);
        }
        return monthlyPayment;
    }
}
// Submitted