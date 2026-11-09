package A4;

import java.util.Random;

public class A4 {
    public static void main(String[] args) throws InterruptedException {
        BoundedBuffer buffer = new BoundedBuffer(3);
        int[] arr = new int[18];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(0, 100);
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        Thread addThread = new Thread(() -> {
            for (int i : arr) {
                buffer.add(i);
            }
        });

        Thread removeThread = new Thread(() -> {
            for (int i = 0; i < arr.length; i++) {
                buffer.remove();
            }
        });

        addThread.start();
        removeThread.start();

        addThread.join();
        removeThread.join();
    }
}
