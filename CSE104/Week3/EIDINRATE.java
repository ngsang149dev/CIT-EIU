package Week3;

import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int testcases = sc.nextInt();
        for (int i = 1; i <= testcases; i++) {
            double money = sc.nextDouble();
            double interestRate = sc.nextDouble();
            double expectedMoney = sc.nextDouble();
            int years = 0;
            double result = 0.0;
            
            result = (Math.log(expectedMoney / money)) / (Math.log(1 + (interestRate / 100)));
            years = (int) Math.ceil(result);
            sb.append(years + "\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
// Submitted