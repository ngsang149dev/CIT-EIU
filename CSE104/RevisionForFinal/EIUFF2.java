package RevisionForFinal;

import java.util.Scanner;

public class EIUFF2 {
    static Scanner sc = new Scanner(System.in);
    public static boolean calculateMoney(double initlMoney,double withdrawMoney, double inflationRate, double interestRate) {
        for (int i = 0; i < 10_000;i++) {
            initlMoney *= 1 + interestRate;
            initlMoney -= withdrawMoney;
            if (initlMoney < 0) { 
                return false;
            }
            withdrawMoney *= (1 + inflationRate);
        }
        return true;
    }

    public static double findInitMoney(double withdrawMoney, double inflationRate, double interestRate) {
        long low = 0;
        long high = Long.MAX_VALUE/2;
        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (calculateMoney(mid, withdrawMoney, inflationRate, interestRate)) {
                high = mid-1;
                ans = mid;
            }
            else low = mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        double interestRate = sc.nextDouble()/ 100;
        double inflationRate = sc.nextDouble() / 100;
        double withdrawMoney = sc.nextDouble();
        double result = findInitMoney(withdrawMoney, inflationRate, interestRate);
        System.out.println(Math.round(result));
    }
}
