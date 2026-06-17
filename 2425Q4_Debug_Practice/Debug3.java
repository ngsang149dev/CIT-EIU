import java.util.*;

public class Debug3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] x = new int[n], y = new int[m];
        for (int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        for (int j = 0; j < m; j++)
            y[j] = sc.nextInt();

        int i = 0, j = 0, c = 0;
        while (i < n && j < m) {
            int a = x[i], b = y[j];
            if (b >= 2 * a && b <= 3 * a) {
                c++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(c);
    }
}

/*
Example
Input:
4 44 4
2 3 2 4
5 10 15 20
Output:
2
*/