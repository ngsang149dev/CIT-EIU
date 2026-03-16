package Lab5;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a;
        if (min > b) {
            min = b;
        }
        int max = a;
        if (max < b) {
            max = b;
        }
        int lcm = (a*b)/gcd(min, max);
        System.out.printf("Greatest Common Divisor = %d\nLess Common Multiple = %d",gcd(min, max), lcm);


    }
    public static int gcd(int min, int max) {
        int maxGcd = 0;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0) {
                if (max % i == 0) {
                    maxGcd = i;
                }
            }
        }
        return maxGcd;
    }
}
