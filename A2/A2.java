package A2;

public class A2 {
    public static void main(String[] args) throws InterruptedException {
        int times = 1_000_000;
        SharedData lockData = new ReentrantLockData(0);
        IncreaseThread increaseThread1 = new IncreaseThread(lockData, times);
        DecreaseThread decreaseThread1 = new DecreaseThread(lockData, times);

        increaseThread1.start();
        decreaseThread1.start();
        increaseThread1.join();
        decreaseThread1.join();
        System.out.printf("Data ater running ReenTrantLock: %s\n",lockData.getData());

        SharedData semaphoreData = new SemaphoreData(0);
        IncreaseThread increaseThread2 = new IncreaseThread(semaphoreData, times);
        DecreaseThread decreaseThread2 = new DecreaseThread(semaphoreData, times);

        increaseThread2.start();
        decreaseThread2.start();
        increaseThread2.join();
        decreaseThread2.join();
        System.out.printf("Data ater running Semaphore: %s\n",semaphoreData.getData());

        SharedData syncData = new SyncData(0);
        IncreaseThread increaseThread3 = new IncreaseThread(syncData, times);
        DecreaseThread decreaseThread3 = new DecreaseThread(syncData, times);

        increaseThread3.start();
        decreaseThread3.start();
        increaseThread3.join();
        decreaseThread3.join();
        System.out.printf("Data ater running synchronized: %s",semaphoreData.getData());
    }
}
