package A5;

public class BarrierThread extends Thread {
    private final MyBarrier barrier;
    private final int name;

    public BarrierThread(MyBarrier barrier, int name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " is running");

        try {
            Thread.sleep(name * 5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " is waiting");

        barrier.await();

        System.out.println("Thread " + name + " continues");
    }
}
