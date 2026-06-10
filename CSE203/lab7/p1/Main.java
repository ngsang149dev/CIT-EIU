package lab7.p1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Logger log1 = Logger.getInstance();
        log1.log("Con bo");
        Thread.sleep(2000);
        Logger log2 = Logger.getInstance();
        log2.log("Con ga");
    }
}