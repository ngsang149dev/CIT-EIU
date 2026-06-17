import java.util.Scanner;

public class SW_Q1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
        }

        long winSum = 0;
        for (int i = 0; i < k;i++) {
            winSum += arr[i];
        }
        long max = winSum;
        for (int i = k; i < n;i++) {
            winSum += arr[i] - arr[i-k];
            if (winSum >= max) max = winSum;
        }
        System.out.println(max);
    }
}
