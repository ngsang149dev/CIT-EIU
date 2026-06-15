package Week3;

import java.util.Scanner;

public class EIPFS2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int task = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
        }
        long[] pfs = new long[n]; //prefixSum
        for (int i = 0; i < n;i++) {
            if (i == 0) {
                pfs[i] = arr[i];
            }
            else {
                pfs[i] = pfs[i-1] + arr[i];
            }
        }
        
        for (int t = 0; t < task;t++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            sb.append(left == 0 ? pfs[right] : pfs[right] - pfs[left-1]);   
        }
        System.out.println(sb);
    }
}
