package RevisionForFinal;

import java.util.Scanner;

class CarBuying {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double oldCarPrice = sc.nextDouble();
        double newCarPrice = sc.nextDouble();
        double m = sc.nextDouble() / 100;
        int n = sc.nextInt();
        double R = sc.nextDouble();
        double L = sc.nextDouble();

        double monthlyInterestRate = R / 100 / 12;
        double depreciationRate = L / 100;
        double downPayment = oldCarPrice * m;
        double loanPrincipal = oldCarPrice - downPayment;
        double targetDownPayment = newCarPrice * m;
        
        double monthlyPayment = 0;
        if (monthlyInterestRate == 0) {
            monthlyPayment = loanPrincipal / n;
        } else {
            monthlyPayment = (loanPrincipal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, n))
                    / (Math.pow(1 + monthlyInterestRate, n) - 1);
        }

        double currentCarValue = oldCarPrice * 0.90; 
        double currentLoanBalance = loanPrincipal;
        double equity = currentCarValue - currentLoanBalance;
        
        int monthsNeeded = 0;
        boolean canBuy = false;

        for (int i = 1; i <= n; i++) {
            currentCarValue = currentCarValue * (1 - depreciationRate);

            if (currentLoanBalance > 0) {
                double interest = currentLoanBalance * monthlyInterestRate;
                currentLoanBalance = currentLoanBalance + interest - monthlyPayment;
                
                if (currentLoanBalance < 0) {
                    currentLoanBalance = 0;
                }
            }

            equity = currentCarValue - currentLoanBalance;

            if (equity >= targetDownPayment) {
                monthsNeeded = i;
                canBuy = true;
                break;
            }
        }

        if (canBuy) {
            System.out.println(monthsNeeded + " 0");
        } else {
            double missing = targetDownPayment - equity;
            System.out.printf("%d %.2f\n", n, missing);
        }
    }
}
