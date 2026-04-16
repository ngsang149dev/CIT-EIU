import java.util.Scanner;

public class EIUPH011 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean[] hasAppeared = new boolean[1_000_001];
        for (int i = 0; i < numbers.length; i++) {
            if (!hasAppeared[numbers[i]]) {
                sb.append(numbers[i]).append(" ");
                hasAppeared[numbers[i]] = true;
            }
        }     
        System.out.println(sb);
    }
}
// Completed