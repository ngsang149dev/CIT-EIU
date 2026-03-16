package RevisionForFinal;

import java.util.Scanner;

public class HomeStrategy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int months = sc.nextInt();
        double HousePrice = sc.nextDouble();
        double monthlyInterestRate = sc.nextDouble();
        double[] housePriceIncraseRates = new double[8];
        for (int i = 0; i < housePriceIncraseRates.length; i++) {
        housePriceIncraseRates[i] = sc.nextDouble();
        }
        double[] monthlySavingRates = new double[8];
        for (int i = 0; i < monthlySavingRates.length; i++) {
        monthlySavingRates[i] = sc.nextDouble();
        }
        double result = findMonthlyPayment(HousePrice, months,
        housePriceIncraseRates, monthlySavingRates, monthlyInterestRate);
        System.out.println(Math.round(Math.floor(result)));
    }

    public static double findMonthlyPayment(double housePrice, int months, double[] housePriceIncraseRates,
            double[] monthlySavingRates, double monthlyInterestRate) {
        long low = 0;
        long high = (long)housePrice * 2;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (check(mid, housePrice, months, housePriceIncraseRates, monthlySavingRates, monthlyInterestRate)) {
                ans = mid;
                high = mid-1;
            } else
                low = mid+1;
        }
        return ans;
    }

    public static boolean check(double monthlyPayment, double housePrice, int months, double[] housePriceIncraseRates,
            double[] monthlySavingRates, double monthlyInterestRate) {
        double currentSaving = 0;
        double currentHousePrice = housePrice;
        double currentLoan = 0;
        boolean hasBought = false;
            
        for (int i = 1; i <= months; i++) {
            int currentRate = (i - 1) / 60;
            if (currentRate >= housePriceIncraseRates.length)
                currentRate = housePriceIncraseRates.length - 1;
            double houseRate = housePriceIncraseRates[currentRate];
            double saveRate = monthlySavingRates[currentRate];

            currentHousePrice *= 1 + houseRate;

            if (!hasBought) {
                currentSaving *= 1 + saveRate;
                currentSaving += monthlyPayment;
                if (currentSaving >= 0.3 * currentHousePrice - 1e-7) {
                    hasBought = true;
                    currentLoan = currentHousePrice - currentSaving;
                    if (currentLoan <= 1e-7)
                        return true;
                }

            } else {
                currentLoan *= 1 + monthlyInterestRate;
                currentLoan -= monthlyPayment;
                if (currentLoan <= 1e-7)
                    return true;
            }
        }
        return hasBought && currentLoan <= 1e-7;
    }
}
