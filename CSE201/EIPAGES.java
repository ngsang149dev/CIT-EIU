import java.util.Arrays;
import java.util.Scanner;

public class EIPAGES {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] pages = new int[n];
        for (int i = 0; i < pages.length;i++) {
            pages[i] = sc.nextInt();
        }
        Arrays.sort(pages);
        for (int i = 0; i < pages.length;i++) {
            if (i >= 1) {
                if (pages[i] - 1 == pages[i-1] && pages[i+1] == pages[i] + 1) {
                    sb.append("-");
                    continue;
                }
            }
            sb.append(pages[i]).append(" ");
        }
        System.out.println(sb);
    }
}
// Uncomplete