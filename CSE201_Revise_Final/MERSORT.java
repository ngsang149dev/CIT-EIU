import java.util.*;

public class MERSORT {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length);

        for (int i : arr) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (right - left <= 1) {
            return;
        }
        int mid = (left + right) >>> 1;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid, right);
        merge(arr, left, mid, right);
    }


    static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid;
        int k = 0;
        int[] tempArr = new int[right-left];
        while (i < mid && j < right) {
            if (arr[i] <= arr[j]) {
                tempArr[k++] = arr[i++];
            }
            else {
                tempArr[k++] = arr[j++];
            }
        }
        while (i < mid) {
            tempArr[k++] = arr[i++];
        }
        while (j < right) {
            tempArr[k++] = arr[j++];
        }

        System.arraycopy(tempArr, 0, arr, left, right-left);
    }
}
