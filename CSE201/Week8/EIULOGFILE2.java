package Week8;

import java.util.Arrays;
import java.util.Scanner;

public class EIULOGFILE2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] logFiles = new long[n];

        for (int i =0; i < n;i++) {
            logFiles[i] = sc.nextLong();
        }
        Arrays.sort(logFiles); 
        for (int i = 0; i < m;i++) {
            long event = sc.nextLong();
            int low = 0; 
            int high = logFiles.length-1;
            long ans = -1;
            while (low <= high) {
                int mid = low + (high -low) / 2;
                if (logFiles[mid] >= event) {
                    ans = logFiles[mid];
                    high = mid -1;
                }
                else low = mid+1;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
