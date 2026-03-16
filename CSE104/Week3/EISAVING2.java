package Week3;

import java.util.Scanner;

class EISAVING2 {
    static double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
            0.0692 };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println(Math.round(calculatingSaving2(n)));
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

    public static double calculatingSaving2(int months) {
        double sum = 0;
        for (int m = months; m >= 1;m--) {
            double money = sc.nextDouble();
            double total = calculatingInterest(money, m);
            sum+= total;
        }
        return sum;
    }
}
// Submitted