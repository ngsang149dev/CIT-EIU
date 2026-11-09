package A4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    private int size;
    private Queue<Integer> queue = new LinkedList<>();
    private Lock lock = new ReentrantLock();
    private Condition nonEmpty = this.lock.newCondition();
    private Condition notFull = this.lock.newCondition();

    public BoundedBuffer(int size) {
        this.size = size;
    }

    public void add(int value) {
        try {
            this.lock.lock();
            try {
                while (queue.size() == size) {
                    notFull.await();
                }

                queue.add(value);
                System.out.printf("Insert: %s | Queue: %s\n".formatted(value, this.queue));
                nonEmpty.signal();
            } finally {
                this.lock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void remove() {
        try {
            this.lock.lock();
            try {
                while (queue.size() == 0) {
                    nonEmpty.await();
                }

                int value = queue.remove();
                System.out.printf("Remove: %s | Queue: %s\n".formatted(value, this.queue));
                notFull.signal();
            } finally {
                this.lock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
