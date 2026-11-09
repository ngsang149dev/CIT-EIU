package A2;

import java.util.concurrent.Semaphore;

public class SemaphoreData implements SharedData {
    private int data;
    private Semaphore semaphore = new Semaphore(1);

    public SemaphoreData(int data) {
        this.data = data;
    }

    @Override
    public void decrement() {
        try {
            this.semaphore.acquire();
            this.data--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.semaphore.release();
        } 
    }

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void increment() {
        try {
            this.semaphore.acquire();
            this.data++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.semaphore.release();
        } 
    }
}
