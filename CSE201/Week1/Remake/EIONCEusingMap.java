package Remake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EIONCEusingMap {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases;t++) {
            int n = sc.nextInt();
            HashMap <Long, Long> map = new HashMap<>();
            for (int i = 0; i < n;i++) {
                long number = sc.nextLong();
                map.put(number, map.getOrDefault(number, 0L)+1);
            }
            List<Long> keys = new ArrayList<>(map.keySet());
            keys.sort((n1, n2) -> {
                return Long.compare(n1.longValue(), n2.longValue());
            });

            for (long key: keys) {
                if (map.get(key) == 1) {
                    sb.append(key).append(" ");
                } 
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
