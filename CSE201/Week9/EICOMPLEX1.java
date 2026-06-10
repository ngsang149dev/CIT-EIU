package Week9;

import java.util.Arrays;
import java.util.Scanner;

public class EICOMPLEX1 {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static long[] arr;
    static int task;
    static int n;

    public static void main(String[] args) {
        String type = sc.next();
        n = sc.nextInt();
        arr = new long[n];
        task = sc.nextInt();
        for (int i = 0; i < n;i++) {
            arr[i] = sc.nextLong();
        }

        switch (type) {
            case "multiplicationEqualsK":
                multiplicationEqualsK();                
                break;
            case "sumFromLToR":
                sumFromLToR();
                break;
            case "indexOfSquareEqualsK":
                indexOfSquareEqualsK();
                break;
            case "countMinSumSubarray":
                countMinSumSubarray();
                break;
            case "sumOfSquaresEqualsK":
                sumOfSquaresEqualsK();
                break;
            case "countMaxSumSubarray":
                countMaxSumSubarray();
                break;
        }
        System.out.println(sb);
    }

    static void countMaxSumSubarray() {
        for (int t = 0; t < task;t++) {
            int k = sc.nextInt();
            long windowSum = 0;
            for (int i = 0; i < k;i++) {
                windowSum += arr[i];
            }
            long max = windowSum;
            int count = 1;
            for (int i = k; i < arr.length;i++) {
                windowSum+= arr[i] - arr[i-k];
                if (windowSum > max) {
                    max = windowSum;
                    count = 1;
                } else if (windowSum == max) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
    }

    static void sumOfSquaresEqualsK() {
        Arrays.sort(arr);
        for (int t = 0; t < task;t++) {
            long target = sc.nextLong();

            int i = 0, j = arr.length-1;
            boolean found = false;
            while (i < j) {
                long temp = arr[i] * arr[i] + arr[j] * arr[j];
                if (temp == target) {
                    sb.append(arr[i]).append(" ").append(arr[j]).append("\n");
                    found = true;
                    break;
                } else if (temp < target) {
                    i++;
                }
                else j--;
            }
            if (!found) sb.append(-1).append("\n");
        }
    }

    static void countMinSumSubarray() {
        for (int t = 0; t <task;t++)  {
            int k = sc.nextInt();
            long windowSum = 0;
            for (int i = 0; i < k;i++) {
                windowSum+= arr[i];
            }
            long min = windowSum;
            int count = 1;
            for (int i = k;i < arr.length;i++) {
                windowSum += arr[i] - arr[i-k];
                if (windowSum < min) {
                    min = windowSum;
                    count = 1;
                } 
                else if (windowSum == min) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
    }

    static void indexOfSquareEqualsK() {
        Arrays.sort(arr);
        for (int t = 0 ; t < task;t++) {
            long target = sc.nextLong();
            int low = 0;
            int high = arr.length-1;
            long ans = -1;
            while (low <= high) {
                int mid = (low + high) >>> 1;
                long temp = arr[mid] * arr[mid];
                if (temp == target) {
                    ans = mid;
                    break;
                }
                else if (temp < target) {
                    low = mid +1;
                } else {
                    high = mid - 1;
                }
            }
            sb.append(ans).append("\n");
        }
    }

    static void multiplicationEqualsK() {
        Arrays.sort(arr);
        for (int t = 0; t < task;t++) {
            long target = sc.nextLong();
            int i = 0;
            int j = arr.length-1;
            boolean found = false;
            while (i < j) {
                long current = arr[i] * arr[j];
                if (current < target) {
                    i++;
                }
                else if (current > target) {
                    j--;
                } else {
                    sb.append(arr[i]).append(" ").append(arr[j]).append("\n");
                    found = true;
                    break;
                }
            }
            if (!found) {
                sb.append(-1).append("\n");
            }
        }
    }

    static void sumFromLToR() {
        long[] pfs = new long[arr.length];
        for (int i = 0; i < n;i++) {
            if (i == 0) {
                pfs[i] = arr[i];
            } else {
                pfs[i] = pfs[i-1] + arr[i];
            }
        }

        for (int t = 0; t < task;t++) {
            int left = sc.nextInt(), right = sc.nextInt();
            sb.append(left == 0 ? pfs[right] : pfs[right] - pfs[left-1]).append("\n");
        }
    }
}