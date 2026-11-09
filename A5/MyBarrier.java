package A5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBarrier {
    private int parties;
    private int partCount;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public MyBarrier(int parties) {
        this.parties = parties;
    }

    public void await() {
        lock.lock();

        try {
            partCount++;

            if (partCount < parties) {
                condition.await();
            } else {
                condition.signalAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
