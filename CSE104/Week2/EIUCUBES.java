package Week2;

import java.util.Scanner;

public class EIUCUBES {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int totalBricks = sc.nextInt();
        calculatingV1(totalBricks);
    }

    public static void calculatingV1 (int totalBricks) {
        int n = (int) Math.cbrt(totalBricks * 6);
        int realBricks = (n * (n + 1) * (n + 2)) / 6;
        if (realBricks > totalBricks) {
            n--;
        }
        System.out.println(n);
    }

}
