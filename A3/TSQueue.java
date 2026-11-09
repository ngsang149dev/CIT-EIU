package A3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TSQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private Lock lock = new ReentrantLock();

    public void addLast(int value) {
        lock.lock();
        try {
            queue.add(value);
        } finally {
            lock.unlock();
        }
    }

    public void removeFirst() {
        lock.lock();
        try {
            queue.remove();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        lock.lock();
        try {
            return queue.toString();
        } finally {
            lock.unlock();
        }
    }
}
