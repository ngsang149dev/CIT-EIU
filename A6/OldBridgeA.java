package A6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OldBridgeA implements IOldBridge {
    private static final int MAX_CAR_CAP = 3;
    private static final int DIRECTION_0 = 0;

    private int carsDir0 = 0;
    private int carsDir1 = 0;
    private int curBridgeDir = -1;

    private final Lock lock = new ReentrantLock();
    private final Condition dir0Condition = lock.newCondition();
    private final Condition dir1Condition = lock.newCondition();

    @Override 
    public void arrive(int dir) throws InterruptedException {
        lock.lock();
        try {
            if (dir == DIRECTION_0) {
                while (!canEnter(dir)) {
                    dir0Condition.await();
                }
                carsDir0++;
            } else {
                while (!canEnter(dir)) {
                    dir1Condition.await();
                }
                carsDir1++;
            }
        } finally {
            lock.unlock();
        }
    }

    @Override 
    public void exit(int dir) {
        lock.lock();
        try {
            if (dir == DIRECTION_0) {
                carsDir0--;
            } else {
                carsDir1--;
            }

            int totalCarsOnBridge = carsDir0 + carsDir1;

            if (totalCarsOnBridge == 0) {
                dir0Condition.signalAll();
                dir1Condition.signalAll();
            } else if (curBridgeDir == DIRECTION_0) {
                dir0Condition.signalAll();
            } else {
                dir1Condition.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    private boolean canEnter(int dir) {
        int totalCarsOnBridge = carsDir0 + carsDir1;

        if (totalCarsOnBridge >= MAX_CAR_CAP) {
            return false;
        }
        return totalCarsOnBridge == 0 || curBridgeDir == dir;
    }

}
