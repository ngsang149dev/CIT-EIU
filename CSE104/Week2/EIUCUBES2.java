package Week2;

import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long k = sc.nextLong();
        for (int i = 1; i <= k;i++) {
            long totalBricks = sc.nextLong();
            sb.append(solve(totalBricks)).append(" ");
        }
        System.out.println(sb);
    }

    public static long solve(long totalBricks) {
        long n = (int) Math.cbrt(totalBricks * 6);
        long realBricks = (n * (n+1) * (n+2)) / 6;
        if (realBricks > totalBricks) {
            n--;
        }
        return n;
    }
}
