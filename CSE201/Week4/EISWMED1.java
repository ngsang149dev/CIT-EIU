package Week4;

import java.util.HashMap;
import java.util.Scanner;

public class EISWMED1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        int k = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('W',0);
        int minChange = 0;
        for (int i = 0; i < k;i++) {
            if (s.charAt(i) == 'W') {
                map.put('W', map.get('W')+1);
            }
            minChange = map.get('W');
        }

        for (int i = k; i < s.length();i++) {
            char firstChar = s.charAt(i-k);
            char lastChar = s.charAt(i);

            if (firstChar == 'W') {
                map.put('W', map.get('W')-1);
            }
            if (lastChar == 'W') {
                map.put('W', map.get('W')+1);
            }

            minChange = Math.min(minChange, map.get('W'));
        }
        System.out.println(minChange);
    }
}
