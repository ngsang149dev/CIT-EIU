

import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int is20 = 0, is10 = 0, is5 = 0, is1 = 0;
        while(true) {
            if (n <= 0) {
                System.out.println(0);
                break;
            }
            else {
                if (n >= 20) {
                    n-= 20;
                    is20++;
                }
                else if (n >= 10) {
                    n-=10;
                    is10++;
                }
                else if (n >= 5) {
                    n-=5;
                    is5++;
                }
                else if (n >= 1) {
                    n-=1;
                    is1++;
                } 
                if (n == 0) break;
            }
        }
        if (is20 > 0) {
            System.out.println("20 " + is20);
        }
        if (is10 > 0) {
            System.out.println("10 " + is10);
        }
        if (is5 > 0) {
            System.out.println("5 " + is5);
        }
        if (is1 > 0) {
            System.out.println("1 " + is1);
        }
    }

    
}


