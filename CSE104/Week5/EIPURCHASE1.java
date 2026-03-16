package Week5;

import java.util.Scanner;

class InstallmentPurchase {
    private long productPrice = 0;
    private int installmentMonths = 0;
    private long prepaidAmount = 0;
    private long monthlyPayment =0;

    public void setInstallmentMonths(int installmentMonths) {
        this.installmentMonths = installmentMonths;
    }

    public void setMonthlyPayment(long monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setPrepaidAmount(long prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    public InstallmentPurchase() {

    }

    public InstallmentPurchase(long productPrice, int installmentMonths, long prepaidAmount, long monthlyPayment) {
        this.productPrice = productPrice;
        this.installmentMonths = installmentMonths;
        this.prepaidAmount = prepaidAmount;
        this.monthlyPayment = monthlyPayment;
    }

    private static double calculateRemainingDebt(long X, long G, int month, double rate) {
        double R = rate + 1.0;
        double initalDebtCompounded /* X*R^n */ = X * Math.pow(R, month);
        double paymentsCompounded /* G*(R^n-1)/r */ = (G * (Math.pow(R, month) - 1)) / rate;
        return initalDebtCompounded - paymentsCompounded;
    }

    private static double findInterestRate(long X, long G, int month) {
        double low = 0;
        double high = 1.0;
        final double epsilon = 1e-10;

        while (low + epsilon < high) {
            double midRate = low + (high - low) / 2;
            double currentDebt = calculateRemainingDebt(X, G, month, midRate);
            if (currentDebt < 0) {
                low = midRate;
            } else
                high = midRate;
        }
        return high; 
    }

    public void display() { 
        long X = productPrice - prepaidAmount;       
        double monthlyRate = findInterestRate(X, monthlyPayment, installmentMonths);
        System.out.printf("%.3f", monthlyRate );
    }
}


public class EIPURCHASE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstallmentPurchase customer1 = new InstallmentPurchase();
        customer1.setProductPrice(sc.nextLong());
        customer1.setInstallmentMonths(sc.nextInt());
        customer1.setPrepaidAmount(sc.nextLong());
        customer1.setMonthlyPayment(sc.nextLong());
        customer1.display();
    }
}