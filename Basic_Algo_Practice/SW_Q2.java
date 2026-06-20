
import java.util.Scanner;

public class SW_Q2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextLong();
        }
        int count = 0;
        for (int i = 0; i < k;i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        for (int i = k;i < n;i++) {
            if(arr[i]>= 0) {
                count++;
            } 
            if (arr[i-k] >= 0) count--;
        }
        System.out.println(count);
    }

    
}
