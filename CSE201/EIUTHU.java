import java.util.Scanner;

public class EIUTHU {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String firstString = sc.next();
        String secondString = sc.next();
        String tempString = "";
        int count = 0;
        for (int i = firstString.length() - 1; i >= 0; i--) {
            tempString = firstString.substring(i, firstString.length());
            if (secondString.startsWith(tempString))
                count = tempString.length();
        }
        System.out.println(firstString.length() + secondString.length() - count);
    }
}