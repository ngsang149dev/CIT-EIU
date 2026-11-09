package A3;

public class AddLastThread extends Thread {
    private final TSQueue queue;
    private final int iterations;

    public AddLastThread(TSQueue queue, int iterations) {
        this.queue = queue;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < iterations) {
            queue.addLast(i);
            i++;
        }
    }
}
