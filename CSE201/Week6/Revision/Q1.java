package Week6.Revision;

import java.util.Scanner;

public class Q1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        String typeOfAlgo = sc.next();
        int n = sc.nextInt();
        int tasks = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        switch (typeOfAlgo) {
            case "Binary":
                for (int i = 0; i < tasks; i++) {
                    long target = sc.nextLong();;
                    int low = 0;
                    int high = arr.length - 1;
                    int ans = -1;

                    while (low <= high) {
                        int mid = low + (high - low) / 2;
                        long expectNumber = arr[mid] * arr[mid];
                        if (expectNumber == target) {
                            ans = mid;
                            high = mid - 1;
                        } else if (arr[mid] >= target) {
                            high = mid - 1;
                        } else
                            low = mid + 1;
                    }
                    sb.append(ans).append("\n");
                }
                break;

            default:
                for (int t = 0; t < tasks; t++) {
                    int k = sc.nextInt();
                    int windowSum = 0;
                    for (int i = 0; i < k;i++) {
                        windowSum+= arr[i];
                    }
                    int count = 1;
                    int min = windowSum;
                    for (int i = k; i < arr.length;i++) {
                        windowSum+= arr[i] - arr[i-k];
                        if (windowSum < min) {
                            min = windowSum;
                            count = 1;
                        } else if (windowSum == min) {
                            count++;
                        }
                    }
                    sb.append(count).append(" \n");
                }
                break;
        }
        System.out.println(sb);
    }
}
