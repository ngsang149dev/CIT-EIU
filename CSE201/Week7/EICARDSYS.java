package Week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EICARDSYS {

    static Scanner sc = new Scanner(System.in);

    static long[] levels = { 1_000_000, 20_000_000, 50_000_000, 200_000_000, Long.MAX_VALUE };
    static double[] rates = { 0, 0.02, 0.03, 0.05, 0.07 };

    static class Customer {
        
        String id;
        double purchasedAmount;
        List<Double> purchasedAmounts = new ArrayList<>();
        public Customer(String id, double purchasedAmount) {
            this.id = id;
            purchasedAmounts.add(purchasedAmount);
        }

        private double calculateDiscount() {
            double sum = 0;
            int j = 0;
            double discount = 0;
            for (int i = 0; i < purchasedAmounts.size();i++) {
                double bill = purchasedAmounts.get(i);
                while (j < levels.length) {
                    if (sum < levels[j]) {
                        discount += (bill * rates[j]);
                        break;
                    }
                    j++;
                }
                sum += bill;
            }
            return discount;
        }

        public double getDiscount() {
            return calculateDiscount();
        }
    }

    public static void main(String[] args) {
        int numberOfTransactions = sc.nextInt();
        HashMap<String, Customer> customerMap = new HashMap<>();
        for (int i = 0; i < numberOfTransactions;i++) {
            String id = sc.next();
            double amount = sc.nextDouble();
            if (customerMap.containsKey(id)) {
                customerMap.get(id).purchasedAmounts.add(amount);
            } else {
                customerMap.put(id, new Customer(id, amount));
            }
        } 
        double totalDiscount = 0;
        for (Customer customer : customerMap.values()) {
            totalDiscount += customer.getDiscount();
        }
        System.out.println(totalDiscount);
    }
}