package Week4.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmsPractice3 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int tasks = sc.nextInt();
        int[] arr = new int[n];
        long[] pfs = new long[n];
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                pfs[i] = arr[i];
            }
            else {
                pfs[i] = pfs[i-1] + arr[i];
            }
        }
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        for (int t = 0; t < tasks; t++) {
            String typeOfAlgo = sc.next();
            switch (typeOfAlgo) {
                case "SlidingWindow":
                    int k = sc.nextInt();
                    SlidingWindow(arr, k);
                    break;

                case "TwoPointer":
                    long targetSum = sc.nextLong();
                    TwoPointer(sortedArr, targetSum);
                    break;
                default:
                    PrefixSum(pfs, sc.nextInt(), sc.nextInt());
            }
        }
        System.out.println(sb);

    }

    static void SlidingWindow(int[] arr, int k) {
        long windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        long maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        sb.append(maxSum).append("\n");
    }

    static void TwoPointer(int[] sortedArr, long targetSum) {
        int p1 = 0;
        int p2 = sortedArr.length - 1;
        long currentSum = 0;
        long bestLeft = -1;
        long bestRight = -1;
        long bestDiff = Long.MAX_VALUE;
        while (p1 < p2) {
            currentSum = sortedArr[p1] + sortedArr[p2];
            if (currentSum == targetSum) {
                long currentDiff = sortedArr[p2] - sortedArr[p1];
                if (currentDiff < bestDiff) {
                    bestDiff = currentDiff;
                    bestLeft = sortedArr[p1];
                    bestRight = sortedArr[p2];
                }
                p1++;
                p2--;

            } else if (currentSum < targetSum) {
                p1++;
            } else {
                p2--;
            }

        }
        sb.append(bestLeft).append(" ").append(bestRight).append("\n");

    }

    static void PrefixSum(long[] pfs, int left, int right) {

        if (left == 0) {
            sb.append(pfs[right]).append("\n");
        } else {
            sb.append(pfs[right] - pfs[left - 1]).append("\n");
        }
    }

}
