package CSE203.lab5.p8;

public class InvalidTestScore extends RuntimeException {

    public InvalidTestScore() {

    }

    public InvalidTestScore(String message) {
        super(message);
    }

    public InvalidTestScore(String message, Throwable cause) {
        super(message, cause);
    }
}
