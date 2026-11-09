package A1;

import java.util.concurrent.Semaphore;

public class A1a {
    public static void main(String[] args) throws InterruptedException {
        ShareSemaphore shareSemaphore = new ShareSemaphore();
        shareSemaphore.s1 = new Semaphore(0);
        shareSemaphore.s2 = new Semaphore(0);
        shareSemaphore.s3 = new Semaphore(0);

        Thread1 thread1 = new Thread1(shareSemaphore);
        Thread2 thread2 = new Thread2(shareSemaphore);
        Thread3 thread3 = new Thread3(shareSemaphore);

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

class ShareSemaphore {
    Semaphore s1;
    Semaphore s2;
    Semaphore s3;
}

class Thread1 extends Thread {
    private ShareSemaphore semaphore;

    public Thread1(ShareSemaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (Thread.currentThread().isInterrupted() == false) {
            System.out.print("S");
            this.semaphore.s1.release();

            try {
                this.semaphore.s3.acquire();
            } catch (InterruptedException e) {
                break;
            }
            System.out.print("W");
        }
    }    
}

class Thread3 extends Thread {
    private ShareSemaphore semaphore;

    public Thread3(ShareSemaphore semaphore) {
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
            System.out.print("T");
            this.semaphore.s2.release();
        }
    }    
}

class Thread2 extends Thread {
    private ShareSemaphore semaphore;

    public Thread2(ShareSemaphore semaphore) {
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
            System.out.print("E");
            this.semaphore.s3.release();
        }
    }    
}

