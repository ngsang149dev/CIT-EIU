package Week4.Practice;

import java.util.Scanner;

public class AlgorithmsPractice1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String typeOfAlgo = sc.next();
        int n = sc.nextInt();
        int tasks = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        switch (typeOfAlgo) {
            case "SlidingWindow":
                SlidingWindow(tasks, nums);
                break;

            case "BinarySearch":
                BinarySearch(tasks, nums);
                break;
        }
        System.out.println(sb);
    }

    static void SlidingWindow(int tasks, int[] nums) {
        for (int t = 0; t < tasks; t++) {
            int k = sc.nextInt();
            int windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += nums[i];
            }
            int min = windowSum;
            for (int i = k; i < nums.length; i++) {
                windowSum += nums[i] - nums[i - k];
                min = Math.min(windowSum, min);
            }
            sb.append(min).append("\n");
        }
    }

    static void BinarySearch(int tasks, int[] nums) {
        for (int t = 0; t < tasks; t++) {
            int target = sc.nextInt();
            int low = 0;
            int high = nums.length - 1;
            int ans = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    ans = mid;
                    break;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            sb.append(ans).append("\n");
        }
    }
}
