package Week2;

import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        var v = sc.nextInt();
        System.out.println(solve(a, b, v));
        sc.close();
    }

    public static int solve(int a, int b, int v) {
        return (int) (Math.ceil((double) (v - a) / (a - b)) + 1);
    }
}