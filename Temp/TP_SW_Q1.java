import java.util.Scanner;

public class TP_SW_Q1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
        }

        int p1 = 0; 
        int best = 0;
        long sum = 0;
        for (int p2 = 0; p2 < n;p2++) {
            sum+= arr[p2];
            while (sum > k) {
                sum-=arr[p1];
                p1++;
            }
            best = Math.max(best, p2 - p1 +1);
        } 
        System.out.println(best);  
    }
}
