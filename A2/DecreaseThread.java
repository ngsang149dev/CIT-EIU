package A2;

public class DecreaseThread extends Thread {
    private final SharedData sharedData;
    private final int times;
    
    public DecreaseThread(SharedData sharedData, int times) {
        this.sharedData = sharedData;
        this.times = times;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < times) {
            sharedData.decrement();
            i++;
        }
    }  
}
