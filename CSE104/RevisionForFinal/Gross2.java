package RevisionForFinal;

import java.util.Scanner;

public class Gross2 {
    static Scanner sc = new Scanner(System.in);
    static long[] ranges = {0L, 5_000_000L, 10_000_000L, 18_000_000L, 32_000_000L, 52_000_000L, 80_000_000L, Long.MAX_VALUE / 2};
    static double[] rates = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};
    public static void main(String[] args) {
        double net = sc.nextDouble();
        double remainingNet = net - 11_000_000;
        double gross = 0;
        if (remainingNet <= 0) {
            System.out.println(net);
            return;
        }
        for (int i = 0; i < ranges.length;i++) {
            double grossWidth = ranges[i+1]- ranges[i];
            double maxNetInBracket = grossWidth * (1 - rates[i]);
            if (remainingNet > maxNetInBracket) {
                gross += grossWidth;
                remainingNet -=maxNetInBracket;
            } else {
                gross += remainingNet / (1 - rates[i]);
                remainingNet = 0;
                break;
            }
        }
        System.out.println(Math.round(gross+11_000_000));
    }
}
