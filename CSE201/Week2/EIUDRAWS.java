package Week2;

import java.util.*;

public class EIUDRAWS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int column = 1; column < line; column++) {
                sb.append(" ");
            }
            sb.append("\\");
            for (int i = 0; i < (n - line) * 2; i++) {
                sb.append(" ");
            }
            sb.append("/");

            for (int column = line * 2; column / 2d > 1; column--) {
                sb.append(" ");
            }
            sb.append("\\");

            for (int i = 0; i < (n - line) * 2; i++) {
                sb.append(" ");
            }
            sb.append("/");
            if (line != n) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
