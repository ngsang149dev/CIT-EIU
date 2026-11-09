package A6;

import java.util.Random;

public class MainB {
    private static final int CROSSING_TIME = 200;

    public static void main(String[] args) throws InterruptedException {
        OldBridgeB oldBridgeB = new OldBridgeB();
        Thread[] threads = new Thread[10];
        Random random = new Random();

        for (int i = 0; i < threads.length; i++) {
            int dir = i % 2;
            int arriveDelay = random.nextInt(100);
            threads[i] = new CarThread(oldBridgeB, i, dir, arriveDelay, CROSSING_TIME);
        }

        for (Thread i : threads) {
            i.start();
        }

        for (Thread i : threads) {
            i.join();
        }

        System.out.println("All cars have crossed the bridge.");
    }
}
