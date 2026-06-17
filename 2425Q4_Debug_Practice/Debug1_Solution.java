import java.util.*;

public class Debug1_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++)
                v[i] = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n;i++) {
                map.put(v[i],map.getOrDefault(v[i], 0)+1);
            }
            long ans = 0;
            for (int i : map.values()) {
                ans += i * (i -1) /2;
            }
            System.out.println(ans);
            t--;
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