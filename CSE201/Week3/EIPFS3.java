package Week3;

import java.util.Scanner;

public class EIPFS3 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        long totalSum = 0;
        for (int i = 0 ; i < n;i++) {
            arr[i] = sc.nextLong();
            totalSum+= arr[i];
        }
        long leftSum = 0;
        boolean found = false;
        for (int i = 0; i < n;i++) {
            long rightSum = totalSum - leftSum - arr[i];
            if (rightSum == leftSum) {
                sb.append(i);
                found = true;
                break;
            }
            leftSum+= arr[i];
        }
        System.out.println(found? sb : -1);
    }
}
