
package Week4;

import java.util.Scanner;
import java.util.Stack;

public class EIUBRACKET2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        // Using Stack
        for (int i = 0; i < testcases;i++) {
            String s = sc.next();
            boolean flag = true;
            Stack<Character> stack = new Stack<>();
            for (char e: s.toCharArray()) {
                if (e == '(' || e == '{' || e == '[') {
                    stack.push(e);
                } else {
                    if (stack.isEmpty()) flag = false;
                    char first = stack.pop();
                    if (e == ')' && first != '(') flag = false;
                    if (e == '}' && first != '{') flag = false;
                    if (e == ']' && first != '[') flag = false;
                }
            }
            flag = flag && stack.isEmpty();
            System.out.println(flag);           
        }
    }
}