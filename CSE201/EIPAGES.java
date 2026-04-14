import java.util.Arrays;
import java.util.Scanner;

public class EIPAGES {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] pages = new int[n];
        for (int i = 0; i < pages.length; i++) {
            pages[i] = sc.nextInt();
        }
        Arrays.sort(pages);

        int i = 0;
        while (i < n) {
            int p1 = i;
            while (i + 1 < n && pages[i] + 1 == pages[i + 1]) {
                i++;
            }

            int p2 = i;
            int gapSize = p2 - p1 + 1;

            if (sb.length() > 0)
                sb.append(" ");
            if (gapSize > 2) {
                sb.append(pages[p1]).append("-").append(pages[p2]);
            } else {
                for (int j = p1; j <= p2; j++) {
                    if (j > p1) {
                        sb.append(" ");
                    }
                    sb.append(pages[j]);
                }
            }
            i++;
        }
        System.out.println(sb);
    }
}
// Completed