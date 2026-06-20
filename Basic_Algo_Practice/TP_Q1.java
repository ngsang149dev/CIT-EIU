import java.util.Scanner;

public class TP_Q1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
        }

        int p1 = 0;
        int p2 = arr.length-1;
        boolean found = false;
        while (p1 < p2) {
            long temp = arr[p1] + arr[p2];
            if (temp == x) {
                found = true;
                break;
            }
            if (temp < x) 
                p1++;
            else p2--;
        }
        System.out.println(found ? "YES" : "NO");
    }
}
