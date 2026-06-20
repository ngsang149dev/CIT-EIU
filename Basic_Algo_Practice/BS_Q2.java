import java.util.Scanner;

public class BS_Q2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int day = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
        }

        long minCap = 0;
        long maxCap = Long.MAX_VALUE/2;
        while (minCap < maxCap) {
            long mid = (minCap + maxCap) >>> 1;
            if (check(arr, mid, day)) {
                maxCap = mid; 
            } else {
                minCap = mid +1;
            }
        }
        System.out.println(minCap);
    }

    static boolean check(long[] arr, long mid, long day) {
        int days = 1;
        long current = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] > mid) {
                return false;
            }
            if (current+ arr[i] <= mid) {
                current+= arr[i];
            } else {
                days++;
                current = arr[i];
            }
        }
        return days <= day;
    }


}
