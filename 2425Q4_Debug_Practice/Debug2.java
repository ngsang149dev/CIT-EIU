import java.util.*;

public class Debug2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int n = sc.nextInt(), budget = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();

        int bestSum = -1, bestDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int total = prices[i] + prices[j];
                if (total < budget) {
                    int d = Math.abs(prices[i] - prices[j]);
                    if (total > bestSum || (total == bestSum && d < bestDiff)) {
                        bestSum = total;
                        bestDiff = d;
                    }
                }
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