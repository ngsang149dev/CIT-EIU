

import java.util.Scanner;

public class EITHU {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String firstString = sc.next();
        String secondString = sc.next();
        int p= process(firstString, secondString);
        System.out.println(p);
        sc.close();
        
    }

    public static int process(String firstString, String secondString) {
        String tempStr = "";
        int count = 0;
        for (int i = firstString.length()-1; i >= 0;i--) {
            tempStr = firstString.substring(i, firstString.length());
            if (secondString.startsWith(tempStr)) {
                count = tempStr.length();
            }
        }
        return firstString.length() + secondString.length() - count;
    }
}
