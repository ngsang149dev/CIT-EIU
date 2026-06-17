import java.util.*;

public class Debug2_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int n = sc.nextInt(), budget = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        // Just chicken use this stupid method
        // int bestSum = -1, bestDiff = Integer.MAX_VALUE;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int total = prices[i] + prices[j];
        //         if (total <= budget) {
        //             int d = Math.abs(prices[i] - prices[j]);
        //             if (total > bestSum || (total == bestSum && d < bestDiff)) {
        //                 bestSum = total;
        //                 bestDiff = d;
        //             }
        //         }
        //     }
        // }
        Arrays.sort(prices);
        int p1 = 0, p2 = prices.length-1;
        int bestSum = -1;
        int bestDiff = Integer.MAX_VALUE;
        while (p1 < p2) {
            int sum = prices[p1] + prices[p2];
            int diff = prices[p2] - prices[p1];
            if (sum <= budget) {
                if (sum > bestSum || (sum == bestSum && diff < bestDiff)) {
                    bestSum = sum;
                    bestDiff = diff;
                    p1++;
                }
            }
            else {
                p2--;
            }
        }
        if (bestSum == -1)
            System.out.println("-1 -1");
        else
            System.out.println(bestSum + " " + bestDiff);
    }
}

/*
Example
Input:
5 100
10
50
60
40
50
Output:
100 0
*/