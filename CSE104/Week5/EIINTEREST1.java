package Week5;

import java.util.Scanner;

public class EIINTEREST1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double fixedMonthlyRate = sc.nextDouble();
        double[] deposits = new double[12];
        for (int i = 0; i < deposits.length;i++) {
            deposits[i]  = sc.nextDouble();
        }

        double totalInterestAmount = 0;
        double R = 1 + fixedMonthlyRate;
        for (int i = 0; i < 12; i++) {
            totalInterestAmount += deposits[i] * Math.pow(R, 12-i);
        }
        System.out.println(Math.round(totalInterestAmount));
    }
}
