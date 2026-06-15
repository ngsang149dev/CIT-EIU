package Week9;

import java.util.Scanner;

public class EIUASSEMBLY {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static class Robot {
        int productivity;
        int increaseCost;

        public Robot(int productivity, int increaseCost) {
            this.productivity = productivity;
            this.increaseCost = increaseCost;
        }   
    }

    public static void main(String[] args) {
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int noRobot = sc.nextInt();
            long budget = sc.nextLong();
            Robot[] robots = new Robot[noRobot];

            for (int i = 0; i < noRobot;i++) {
                Robot robot = new Robot(sc.nextInt(), sc.nextInt());
                robots[i] = robot;
            }

            long min = 0, max = (long)2e12;
            while (min + 1 < max) {
                long mid = (min + max) >>> 1;
                long cost = calculateCostToIncrease(robots, mid, budget);
                if (cost <= budget) {
                    min = mid;
                } else {
                    max = mid;
                }
            }
            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }

    static long calculateCostToIncrease(Robot[] robots,long target, long budget) {
        long totalCost = 0;
        for (Robot robot : robots) {
            if (robot.productivity < target) {
                long productivityNeededEachRobot = target-robot.productivity;
                totalCost +=  productivityNeededEachRobot * robot.increaseCost; 
                if (totalCost > budget) return totalCost;
            }
        }
        return totalCost;
    }

}