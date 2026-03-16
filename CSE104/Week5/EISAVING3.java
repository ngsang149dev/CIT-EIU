package Week5;

import java.util.Scanner;

public class EISAVING3 {
    static Scanner sc = new Scanner(System.in);
    static double[] rates = {
         0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
            0.0692 
    };

    public static double calculateGrowthFactor(int months) {
        double growthFactor = 0;
        double years = months / 12;
        int remainMonths = months % 12;
        growthFactor = Math.pow(1+ rates[11], years);
        if (remainMonths != 0) {
            growthFactor *= 1 + (rates[remainMonths-1]/12 * remainMonths);
        }
        return growthFactor;
    }

    public static double totalGrowthFactor(int months) {
        double sum = 0;
        for (int i = months; i>0;i--) {
            sum+= calculateGrowthFactor(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        double expectedReceivingMoney = sc.nextDouble();
        int months = sc.nextInt();
        double monthlyRequiredAmount = expectedReceivingMoney / totalGrowthFactor(months);
        System.out.printf("%.4f", monthlyRequiredAmount);
    }
}
