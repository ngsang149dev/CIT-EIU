package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class EISW1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int p1 = 0, p2 = 0, diff = 0;
        for (int i = 0; i < n;i++) {
            p1 = arr[i];
        }
    }
}