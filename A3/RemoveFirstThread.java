package A3;

public class RemoveFirstThread extends Thread {
    private final TSQueue queue;
    private final int iterations;

    public RemoveFirstThread(TSQueue queue, int iterations) {
        this.queue = queue;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < iterations) {
            queue.removeFirst();
            i++;
        }
    }
}
