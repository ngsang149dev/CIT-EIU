package A1;

import java.util.concurrent.Semaphore;

public class A1b {
    public static void main(String[] args) throws InterruptedException {
        ShareSemaphoreB shareSemaphore = new ShareSemaphoreB();
        shareSemaphore.s1 = new Semaphore(0);
        shareSemaphore.s2 = new Semaphore(0);
        shareSemaphore.s3 = new Semaphore(0);

        Thread1B thread1 = new Thread1B(shareSemaphore);
        Thread2B thread2 = new Thread2B(shareSemaphore);
        Thread3B thread3 = new Thread3B(shareSemaphore);

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(5);
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}

class ShareSemaphoreB {
    Semaphore s1;
    Semaphore s2;
    Semaphore s3;
}

class Thread1B extends Thread {
    private ShareSemaphoreB semaphore;

    public Thread1B(ShareSemaphoreB semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (Thread.currentThread().isInterrupted() == false) {
            System.out.print("S");
            this.semaphore.s1.release();
            System.out.print("W");
            this.semaphore.s1.release();

            try {
                this.semaphore.s3.acquire();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class Thread2B extends Thread {
    private ShareSemaphoreB semaphore;

    public Thread2B(ShareSemaphoreB semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (Thread.currentThread().isInterrupted() == false) {
            try {
                this.semaphore.s1.acquire();
            } catch (InterruptedException e) {
                break;
            }
            System.out.print("E");

            try {
                this.semaphore.s1.acquire();
            } catch (InterruptedException e) {
                break;
            }
            System.out.print("E");
            this.semaphore.s2.release();
        }
    }
}

class Thread3B extends Thread {
    private ShareSemaphoreB semaphore;

    public Thread3B(ShareSemaphoreB semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (Thread.currentThread().isInterrupted() == false) {
            try {
                this.semaphore.s2.acquire();
            } catch (InterruptedException e) {
                break;
            }

            System.out.print("T");
            this.semaphore.s3.release();
        }
    }    
}
