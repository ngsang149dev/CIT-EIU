package Week3;

import java.util.Scanner;

public class EIPFS1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long[] result = new long[n]; //prefixSum
        for (int i = 0; i < n;i++) {
            if (i == 0) {
                result[i] = arr[i];
            }
            else {
                result[i] = result[i-1] + arr[i];
            }
        }
        for (long e : result) {
            sb.append(e).append(" ");
        }
        System.out.println(sb);
    }
}
