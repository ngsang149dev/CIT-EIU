package Week4;

import java.util.Scanner;

class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        int[] salesLadder = {0, 20, 50, 200, 500, 2000, Integer.MAX_VALUE};
        double[] rateRewards = {0.02, 0.03, 0.04, 0.05, 0.06, 0.07};
        double reward = 0;
        for (int i = 0; i < salesLadder.length-1;i++) {
            if (sales > salesLadder[i]) {
                reward += (Math.min(sales, salesLadder[i+1]) - salesLadder[i]) * rateRewards[i];
            }
        }
        System.out.println(reward);    
    }    
}
// Submitted