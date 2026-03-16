package RevisionForFinal;

import java.util.Scanner;

public class Loan {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double productValue = sc.nextDouble();
        double availableMoney = sc.nextDouble();
        int months = sc.nextInt();
        double monthlyRate = sc.nextDouble() /100;
        double totalDebt = productValue - availableMoney;
        double monthlyPrincipal = totalDebt / months;
        double currentDebt = totalDebt;
        for (int i = 1; i <= months;i++) {
            double interest = currentDebt   * monthlyRate;
            double monthlyPay = monthlyPrincipal + interest;
            sb.append(i+ " "+Math.round(monthlyPay)+"\n");
            currentDebt-=monthlyPrincipal;
        }
        System.out.println(sb);
    }

}
