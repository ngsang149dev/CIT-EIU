package Week5;

import java.util.Scanner;

public class EICREDIT {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int transactionsNumber = sc.nextInt();
        double monthlyInterestRate = sc.nextDouble();
        int totalDays = sc.nextInt();
        double result = calculateBalance(dailyTransactions(transactionsNumber, totalDays), monthlyInterestRate, totalDays);
        System.out.println(result);
    }

    // Done
    public static long[] dailyTransactions(int transactionsNumber, int totalDays) {
        long[] dailyTransactions = new long[totalDays + 1];
        for (int i = 0; i < transactionsNumber; i++) {
            int day = sc.nextInt();
            long dailyTransaction = sc.nextLong();
            dailyTransactions[day] += dailyTransaction;
        }
        return dailyTransactions;
    }

    public static double calculateBalance(long[] dailyTransactions, double monthlyInterestRate, int totalDays) {
        double currentBalance = 0;
        double sumOfDailyDebt = 0;
        for (int i = 0; i <= totalDays;i++) {
            if (currentBalance < 0) {
                sumOfDailyDebt+= currentBalance;
            }
            currentBalance+= dailyTransactions[i];
            if (isInterestDay(i)) {
                double avgDailyDebt = sumOfDailyDebt / 30;
                double interest = monthlyInterestRate * avgDailyDebt;
                currentBalance += interest;
                sumOfDailyDebt = 0;
            }
        }
        return currentBalance;
    }
    private static boolean isInterestDay(int day) {
        return (day % 30 == 1) && (day > 1);
    }
}
