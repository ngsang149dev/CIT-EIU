import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        long budget = sc.nextLong();
        List<Tower> towers = new ArrayList<>();
        for (int i = 0; i < n;i++) {
            towers.add(new Tower(sc.nextLong(), sc.nextLong()));
        }
        long min = 0, max = (long)2e14;
        while (min+1 < max) {
            long mid = (min + max) >>> 1;
            long tempCost = calculateTotalCostToUpgrade(towers, mid, budget);
            if (tempCost <= budget) {
                min = mid;
            } else max = mid;
        }
        System.out.println(min);
    }

    static long calculateTotalCostToUpgrade(List<Tower> towers, long mid, long budget) {
        long totalCost = 0;
        for (Tower t : towers) {
            if (t.currAttackPower < mid) {
                long attackNeededEachTower = mid - t.currAttackPower;
                totalCost += attackNeededEachTower * t.costToUpgrade;
                if (totalCost > budget) return totalCost;
            }
        }
        return totalCost;
    }

    static class Tower {
        long currAttackPower;
        long costToUpgrade;

        public Tower(long currAttackPower, long costToUpgrade) {
            this.currAttackPower = currAttackPower;
            this.costToUpgrade = costToUpgrade;
        }

    }
}
