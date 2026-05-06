package Week4;

import java.util.Arrays;
import java.util.Scanner;

public class EIBISEA {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int number = sc.nextInt();
        int checkNumber = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < checkNumber;i++) {
            int checkingNumber = sc.nextInt();
            int result = binarySearch(arr, checkingNumber);
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high-low) /2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid-1; //continuing sliding to the left to find the first occurence
            } else if (arr[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

}
