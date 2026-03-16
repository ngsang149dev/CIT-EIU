package Week2;

import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long numbers = sc.nextLong();

        String[] fingers = {"cai","tro","giua","ap ut","ut"};
        String[] hands = {"trai","phai"};
        var sb = new StringBuilder();
        var sb1 = new StringBuilder();

        while(true) {
            numbers %= 18;
            if (numbers > 10) {
                numbers = 20 - numbers;
            }
            if (numbers <= 5) {
                sb.append(hands[0]);
                sb1.append(fingers[(int)numbers-1]);
            }
            else {
                sb.append(hands[1]);
                sb1.append(fingers[(int)(10-numbers)]);
            }
            if (numbers / 18 == 0) {
                break;
            }
        }

        System.out.println("Ngon " + sb1 + " cua ban tay " + sb);
    }
}
