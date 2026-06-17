import java.util.Scanner;

public class BS_Q1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long min = 0;
        long max = (long) 1e18;

        while (min < max) {
            long mid = (min + max) >>> 1;
            long products = calculate(arr, mid, k);
            if (products >= k) {
                max = mid;
            } else {
                min = mid+1;
            }
        }
        System.out.println(min);
    }

    static long calculate(long[] arr,long mid, long k) {
        long products = 0;
        for (long i : arr) {
            products += mid / i;
            if (products >= k) {
            return k;
            }
        }
        
        return products;
    }
}