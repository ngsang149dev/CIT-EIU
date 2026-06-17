import java.util.*;

public class Debug4_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int arrayLength = scanner.nextInt();
            long multiplier = scanner.nextLong();
            long modulo = scanner.nextLong();
            int position = scanner.nextInt();

            // Generate array
            long[] sequence = new long[arrayLength];
            long currentValue = (multiplier * multiplier) % modulo;

            for (int i = 0; i < arrayLength; i++) {
                sequence[i] = currentValue;
                currentValue = (currentValue * multiplier) % modulo;
            }

            long result = findByK(sequence, 0, arrayLength - 1, position-1);
            System.out.println(result);
        }

        scanner.close();
    }

    private static long findByK(long[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }
        if (left > right) {
            return -1;
        }
        int pivotIndex = split(arr, left, right);

        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return findByK(arr, left, pivotIndex - 1, k);
        }

        return findByK(arr, pivotIndex + 1, right, k);
    }

    private static int split(long[] arr, int left, int right) {
        long splitElement = arr[right];
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] <= splitElement) {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }

        swap(arr, storeIndex, right);
        return storeIndex;
    }

    private static void swap(long[] arr, int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
Example
Input:
2
70 1356 1000000297 1
63 159 1000002937 3

Output:
1838736
13341658
*/
