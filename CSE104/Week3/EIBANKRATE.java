package Week3;

import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int months = sc.nextInt();
        double result = money * (1 + (0.09/12) * months); //In the question, 9% rate is interest rate each year. So have to / 12;
        System.out.printf("%.3f%n",result);
    }
}
// Submitted