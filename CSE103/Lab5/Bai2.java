package Lab5;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sumDenomirator = 0;
        double finalS = 0;
        for (double i = 1; i <= n; i++) {
            sumDenomirator += i;
            finalS += 1 / sumDenomirator;
        }
        System.out.printf("%.2f",finalS);

    }

}
