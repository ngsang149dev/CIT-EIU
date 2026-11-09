package A5;

public class A5 {
    public static void main(String[] args) {
        MyBarrier myBarrier = new MyBarrier(3);

        for (int i = 1; i <= 3; i++) {
            BarrierThread thread = new BarrierThread(myBarrier, i);
            thread.start();
        }
    }
}
