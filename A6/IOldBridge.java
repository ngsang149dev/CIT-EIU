package A6;

public interface IOldBridge {
    void arrive(int dir) throws InterruptedException;
    void exit(int dir) throws InterruptedException;
}