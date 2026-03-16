package Week3;

import java.util.Scanner;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            double NET = sc.nextDouble();
            double TAX = NET / 9; //Tax rate is 10%. Remainder is 90%. In order to compute tax => ramainder * 10
            sb.append(TAX + "\n");
        }
        System.out.println(sb.toString());
    }
}
// Submiited
