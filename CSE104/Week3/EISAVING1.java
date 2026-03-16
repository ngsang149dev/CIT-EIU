package Week3;

import java.util.Scanner;

class EISAVING1 {
    static double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
            0.0692 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int months = sc.nextInt();

        System.out.println(Math.round(calculatingInterest(money, months)));
    }

    public static double calculatingInterest(double money, int months) {
        double total = 0;
        int years = months / 12;
        int remainingMonths = months % 12;

        total = money * Math.pow((1 + rates[11] / 12 * 12), years);
        if (remainingMonths != 0) {
            total = total * (1 + rates[remainingMonths - 1] / 12 * remainingMonths);
        }
        return total;
    }
}
// Submitted