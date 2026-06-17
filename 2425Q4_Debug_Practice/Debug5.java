import java.util.*;

class Debug5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int left = 0;
        int right = numbers[numbers.length - 1];
        int minDiff = Integer.MIN_VALUE;
        while (left < right) {
            int mid = (left + right) / 2;
            if (count(numbers, mid) >= k) {
                minDiff = mid;
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.println(minDiff);
    }

    static int count(int[] arr, int mid) {
        int count = 0;
        int lastElement = arr[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= lastElement + mid) {
                lastElement = arr[i];
                count++;
            }
        }
        return count;
    }
}

/*
INPUT
4 3
2 6 2 5
OUTPUT
1
*/