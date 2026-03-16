

import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true) {
            if (n >= 90) {
                System.out.println("A");
                break;
            }
            else if (n >= 85) {
                System.out.println("A-");
                break;
            }
            else if (n >= 80) {
                System.out.println("B+");
                break;
            }
            else if (n >= 75) {
                System.out.println("B");
                break;
            }
            else if (n >= 70) {
                System.out.println("B-");
                break;
            }
            else if (n >= 65) {
                System.out.println("C+");
                break;
            }
            else if (n >= 60) {
                System.out.println("C");
                break;
            }
            else if (n >= 55) {
                System.out.println("C-");
                break;
            }
            else if (n >= 53) {
                System.out.println("D+");
                break;
            }
            else if (n >= 52) {
                System.out.println("D");
                break;
            }
            else if (n >= 50) {
                System.out.println("D-");
                break;
            }
            else {
                System.out.println("F");
                break;
            }
        }
    }
}
