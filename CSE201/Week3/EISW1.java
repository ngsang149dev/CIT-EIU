package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class EISW1 {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        for (int i = 0; i + k -1 < arr.length;i++) {
            int gap = arr[i+k-1] - arr[i];
            min = Math.min(min, gap);
        }
        System.out.println(min);
    }
}