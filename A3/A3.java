package A3;

public class A3 {
    public static void main(String[] args) throws InterruptedException {
        TSQueue queue = new TSQueue();
        int iterations = 10;

        AddLastThread addLastThread = new AddLastThread(queue, iterations);
        RemoveFirstThread removeFirstThread = new RemoveFirstThread(queue, iterations);

        addLastThread.start();
        addLastThread.join();

        System.out.println("Queue after add last: " + queue);
        
        Thread.sleep(5_000);

        removeFirstThread.start();
        removeFirstThread.join();
        System.out.println("Queue after remove first: " + queue);
    }
}
