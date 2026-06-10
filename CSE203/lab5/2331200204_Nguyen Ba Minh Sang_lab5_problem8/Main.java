package CSE203.lab5.p8;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        TestScores scores = new TestScores(arr);
        System.out.println(scores);
    }
}
