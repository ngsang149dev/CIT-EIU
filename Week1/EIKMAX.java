import java.util.Arrays;
import java.util.Scanner;

public class EIKMAX {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long[] numbers = new long[(int) n];
        for (long i = 0; i < n; i++) {
            numbers[(int) i] = sc.nextLong();
        }
        Arrays.sort(numbers);
        for (int i =(int) n-1; i >=(int) n - k;i--) {
            sb.append(numbers[i]).append(" ");
        }
        System.out.println(sb);
    }   
}
// Completed