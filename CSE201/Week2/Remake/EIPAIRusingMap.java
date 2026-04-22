package Week2.Remake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EIPAIRusingMap {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = sc.nextInt();
            HashMap<Long, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long number = sc.nextLong();
                if (map.get(number) == null) {
                    map.put(number, 1L);
                } else {
                    long count = map.get(number);
                    map.put(number, count+1);
                }
                // map.put(number, map.getOrDefault(number, 0L)+1);
            }
            long ways = 0;
            List<Long> values = new ArrayList<>(map.values());
            for (Long value: values) {
                ways += (value * (value-1)) / 2;
            }
            sb.append(ways).append("\n");
        }
        System.out.println(sb);
    }
}
