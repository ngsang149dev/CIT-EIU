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
        long[] tempArr = new long[n]; //prefixSum
        for (int i = 0; i < n;i++) {
            if (i == 0) {
                tempArr[i] = arr[i];
            }
            else {
                tempArr[i] = tempArr[i-1] + arr[i];
            }
        }
        
        for (int t = 0; t < task;t++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left == right) {
                sb.append(arr[right]).append("\n");
            }
            else if (left != right && left == 0) {
                sb.append(tempArr[right]).append("\n");
            }
            else {
                sb.append(tempArr[right] - tempArr[left-1]).append("\n");
            }    
        }
        System.out.println(sb);
    }
}
