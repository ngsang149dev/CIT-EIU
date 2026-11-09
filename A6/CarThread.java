package A6;

public class CarThread extends Thread {
    private final IOldBridge bridge;
    private final int carID;
    private final int dir;
    private final int arriveDelay;
    private final int crossingTime;

    public CarThread(IOldBridge bridge, int carID, int dir, int arriveDelay, int crossingTime) {
        this.bridge = bridge;
        this.carID = carID;
        this.dir = dir;
        this.arriveDelay = arriveDelay;
        this.crossingTime = crossingTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(arriveDelay);

            System.out.println("Car " + carID + " arrives, dir = " + dir);
            bridge.arrive(dir);

            System.out.println("Car " + carID + " is on the bridge, dir = " + dir);
            Thread.sleep(crossingTime);

            bridge.exit(dir);
            System.out.println("Car " + carID + " exits, dir = " + dir);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
