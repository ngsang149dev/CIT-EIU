import java.util.*;

public class Debug1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++)
                v[i] = sc.nextInt();
            int p = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (v[i] == v[j])
                        p++;
                }
            }
            System.out.println(p);
        }
    }
}

/*
Example
Input:
2
5 3 4 3 4 3
3 1 1 1
Output:
4
3
 */