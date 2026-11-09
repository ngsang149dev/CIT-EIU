package A2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockData implements SharedData {
    private int data;
    private Lock lock = new ReentrantLock();

    public ReentrantLockData(int data) {
        this.data = data;
    }
    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void decrement() {
        this.lock.lock();
        try {
            this.data--;
        } finally {
            this.lock.unlock();
        }
    }

    @Override
    public void increment() {
        this.lock.lock();
        try {
            this.data++;
        } finally {
            this.lock.unlock();
        }
    }
}