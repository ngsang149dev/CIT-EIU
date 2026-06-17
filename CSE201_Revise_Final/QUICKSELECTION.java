import java.util.Random;
import java.util.Scanner;

public class QUICKSELECTION {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void main(String[] args) {
        int N = sc.nextInt();
        int A = sc.nextInt();
        long P = sc.nextLong();
        int K = sc.nextInt();

        long[] arr = new long[N];
        arr[0] = ((long) A * A ) % P;
        for (int i = 1; i < N;i++) {
            arr[i] = (arr[i-1]*A) %P;
        }

        System.out.println(quickSelection(arr, 0, arr.length-1, K));
    }

    static long quickSelection(long[] arr, int left, int right, int k)  {
        if (left >= right) return arr[left];
        int pivotIdx =  partition(arr, left, right, k);

        if (pivotIdx == k) {
            return arr[k];
        } else if (k < pivotIdx) {
            return quickSelection(arr, left, pivotIdx-1, k);
        } else {
            return quickSelection(arr, pivotIdx+1, right, k);
        }
    }

    static int partition(long[] arr, int left, int right, int k) {
        int randomIndex = rd.nextInt(left, right);
        swap(arr, left, randomIndex);
        long pivotVal = arr[left];
        int j = left +1;
        for (int i = left+1; i<= right;i++) {
            if (arr[i] < pivotVal || (arr[i] == pivotVal && rd.nextDouble() < 0.5)) {
                swap(arr, i, j++);
            }
        }
        swap(arr, left, j-1);
        return j-1;
    }

    static void swap(long[] arr, int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
