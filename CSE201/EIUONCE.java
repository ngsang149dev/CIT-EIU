import java.util.Arrays;
import java.util.Scanner;
public class EIUONCE {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases;t++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n;i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            solution(array, n);
        }
        System.out.println(sb);
    }

    static String solution(int[] array, int n) {
        if (array[0] != array[1]) {
            sb.append(array[0]).append(" ");
        }
        for (int i = 1; i < n-1;i++) {
            if (array[i] != array[i-1] && array[i] != array[i+1]) {
                sb.append(array[i]).append(" ");
            }
        }
        if (array[n-1] != array[n-2]) {
            sb.append(array[n-1]).append(" ");
        }     
        sb.append("\n");
        return sb.toString();
    }
}
// Uncomplete