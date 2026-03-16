package Week2;

import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            long blueGift = sc.nextLong();
            long redGift = sc.nextLong();
            long bluePrice = sc.nextLong();
            long redPrice = sc.nextLong();
            long exchangePrice = sc.nextLong();
            long answer = sovle(blueGift, redGift, bluePrice, redPrice, exchangePrice);
            System.out.println(answer);
        }
        sc.close();
    }
    public static long sovle (long blueGift, long redGift, long bluePrice, long redPrice, long exchangePrice) {
        long effectiveBluePrice = Math.min(bluePrice, redPrice + exchangePrice);
        long effectiveRedPrice = Math.min(redPrice, bluePrice + exchangePrice);
        return blueGift * effectiveBluePrice + redGift * effectiveRedPrice;
    }
    
}
