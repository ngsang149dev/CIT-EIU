import java.util.*;

public class Debug6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        for (int i = 0; i <= N; i++) {
            A[i] = sc.nextInt();
            max = Math.max(max, A[i]);
        }
        int low = 0, high = max, ans = 0;
        while (low < high) {
            int mid = (low + high) / 2;
            if (canSplit(A, mid, K)) {
                ans = mid;
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println("Answer is: " + ans);
    }

    static boolean canSplit(int[] A, int limit, int K) {
        int segments = 0, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum + A[i] > limit) {
                segments++;
                sum = 0;
            }
            sum += A[i];
        }
        return segments <= K;
    }
}

/*
INPUT
5 3
2 3 1 4 6
OUTPUT
6
*/