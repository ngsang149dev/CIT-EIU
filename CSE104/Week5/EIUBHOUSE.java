package Week5;

import java.util.Scanner;

public class EIUBHOUSE {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        double productPrice = sc.nextDouble();
        double initPrice = sc.nextDouble();
        int months = sc.nextInt();
        double rate = sc.nextDouble() / 100;

        double remainingDebt = productPrice - initPrice; 
        double principal = remainingDebt / months;
        for (int i = 1; i <= months; i++) {
            double monthlyPayment = remainingDebt * rate + principal;
            sb.append(i).append(" ").append(Math.round(monthlyPayment)).append("\n");
            remainingDebt -=principal;
        }
        System.out.println(sb.toString());
    }
}
// Submitted