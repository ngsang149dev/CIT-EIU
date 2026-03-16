package Week3;

import java.util.Scanner;

public class EIMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int price = 200;
        while (n > 0 && price > 180) {
            sum+=price*Math.min(n,100);
            n-=Math.min(n, 100);
            price--;
        }
        if (n > 0) {
            sum+= 180*n;
        }
        System.out.println(sum);
    }
}
// Submitted

