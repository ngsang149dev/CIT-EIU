import java.util.Scanner;

public class EIUPH010 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] counts = new int[1_000_001];
        for (int i = 0; i < numbers.length;i++) {
            counts[numbers[i]]++;
        }
        int value = 0, frequency = 0;
        for (int i = 0; i < counts.length;i++) {
            if (counts[i] > frequency) {
                frequency = counts[i];
                value = i;
            }
        }
        sb.append(value).append(" ").append(frequency);
        System.out.println(sb);
    }
}
// Completed