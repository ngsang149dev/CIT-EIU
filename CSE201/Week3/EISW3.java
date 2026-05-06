    package Week3;

    import java.util.HashMap;
    import java.util.Scanner;

    public class EISW3 {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            String s = sc.next();

            int k = 3;
            int ans = 0;
            if (s.length() < 3) {
                ans = 0;
            } else {
                HashMap<Character, Integer> map = new HashMap<>();
                int count = 0;
                for (int i = 0; i < k; i++) {
                    char tempChar = s.charAt(i);
                    map.put(tempChar, map.getOrDefault(tempChar, 0) + 1);
                    if (map.get(tempChar) == 1) count++;
                }
                if (count==k) ans++;
                for (int i = k; i < s.length(); i++) {
                    char oldChar = s.charAt(i-k);
                    map.put(oldChar, map.get(oldChar)-1); // remove distinct i-k
                    if (map.get(oldChar) == 0) count--;
                    char newChar = s.charAt(i);
                    map.put(newChar, map.getOrDefault(newChar, 0) + 1); // add distinct when occuring fistly
                    if (map.get(newChar) == 1) count++;
                    if (count == 3) ans++;
                }
            }
            System.out.println(ans);
        }
    }
