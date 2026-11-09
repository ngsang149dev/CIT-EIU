package A6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OldBridgeB implements IOldBridge {
    private static final int MAX_CAR_CAP = 3;
    private static final int DIRECTION_0 = 0;
    private static final int DIRECTION_1 = 1;

    private int carsDir0 = 0;
    private int carsDir1 = 0;
    private int waitingDir0 = 0;
    private int waitingDir1 = 0;
    private int curBridgeDir = -1;
    private int lastServedDir = -1;

    private final Lock lock = new ReentrantLock(true);
    private final Condition dir0Condition = lock.newCondition();
    private final Condition dir1Condition = lock.newCondition();

    @Override
    public void arrive(int dir) throws InterruptedException {
        try {
            lock.lock();

            if (dir == DIRECTION_0) {
                waitingDir0++;
            } else {
                waitingDir1++;
            }

            try {
                while (!canEnter(dir)) {
                    if (dir == DIRECTION_0) {
                        dir0Condition.await();
                    } else {
                        dir1Condition.await();
                    }
                }
            } catch (InterruptedException e) {
                if (dir == DIRECTION_0) {
                    waitingDir0--;
                } else {
                    waitingDir1--;
                }
                dir0Condition.signalAll();
                dir1Condition.signalAll();
                e.printStackTrace();
            }

            if (dir == DIRECTION_0) {
                waitingDir0--;
            } else {
                waitingDir1--;
            }

            if (dir == DIRECTION_0) {
                carsDir0++;
            } else {
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
                lastServedDir = dir;
                curBridgeDir = -1;

                dir0Condition.signalAll();
                dir1Condition.signalAll();
            } else {
                boolean otherDirectionWaiting = (dir == DIRECTION_0) ? waitingDir1 > 0 : waitingDir0 > 0;
                if (!otherDirectionWaiting) {
                    if (dir == DIRECTION_0) {
                        dir0Condition.signalAll();
                    } else {
                        dir1Condition.signalAll();
                    }
                }
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

        int otherDirWait = (dir == DIRECTION_0) ? waitingDir1 : waitingDir0;

        if (totalCarsOnBridge == 0) {
            if (otherDirWait == 0) {
                return true;
            }
            return nextTurnDir() == dir;
        }

        return curBridgeDir == dir && otherDirWait == 0;
    }

    private int nextTurnDir() {
        if (lastServedDir == DIRECTION_0) {
            return DIRECTION_1;
        }
        return DIRECTION_0;
    }

}
