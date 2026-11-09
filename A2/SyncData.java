package A2;

public class SyncData implements SharedData{
    private int data;

    public SyncData(int data) {
        this.data = data;
    }

    @Override
    public synchronized void decrement() {
        this.data--;
    }

    @Override
    public synchronized int getData() {
        return data;
    }

    @Override
    public synchronized void increment() {
        this.data++;
    }
}