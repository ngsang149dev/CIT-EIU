package Week9;

import java.util.Arrays;
import java.util.Scanner;

public class EIUMINDIST {
    static Scanner sc = new Scanner(System.in);
    static int[] arr;
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int minLeft = 1;
        int minRight = 1_000_000_000;
        int ans = 0;
        while (minLeft <= minRight) {
            int minMid = (minLeft + minRight) >>> 1;
            int numberOfElement = findElements(minMid);
            if (numberOfElement >= k ) {
                ans = minMid;
                minLeft = minMid +1;
            } else minRight = minMid-1;
        }
        System.out.println(ans);
    }

    static int findElements(int min) {
        int current = arr[0];
        int count = 1;
        while (true) {
            int nextNum = Arrays.binarySearch(arr, current+min);
            if (nextNum < 0) {
                nextNum = ~nextNum;
            } 
            if (nextNum < arr.length) {
                count++;
                current = arr[nextNum];
            } 
            else break;
        }
        return count;
    }
}