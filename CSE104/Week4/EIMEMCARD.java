package Week4;

import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long[] levels = { 1_000_000, 20_000_000, 50_000_000, 200_000_000, Long.MAX_VALUE };
        double[] rates = { 0, 0.02, 0.03, 0.05, 0.07 };
        int itemNumber = sc.nextInt();
        long sum = 0;
        int j = 0;
        for (int i = 1; i <= itemNumber; i++) {
            long bill = sc.nextLong();
            while (j < levels.length) {
                if (sum < levels[j]) {
                    double discount = (bill * rates[j]);
                    if (discount == (long) discount) {
                        sb.append((long) discount).append(" ");
                    } else {
                        sb.append(discount).append(" ");
                    }    
                    break;
                }
                j++;
            }
            sum += bill;
        }
        System.out.println(sb);
    }
}
