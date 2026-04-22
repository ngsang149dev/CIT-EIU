package Remake;
import java.util.HashMap;
import java.util.Scanner;

public class EIPH010usingMap {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n;i++) {
            long number = sc.nextInt();
            map.put(number, map.getOrDefault(number, 0L)+1);
        }
        long bestNum = 0;
        long bestCount = 0;

        for (long key: map.keySet()) {
            long count = map.get(key);
            if (count > bestCount || (count == bestCount && key < bestNum)) {              
                    bestCount = count;
                    bestNum = key;          
            }
        }
        sb.append(bestNum).append(" ").append(bestCount);
        System.out.println(sb);
    }
}
