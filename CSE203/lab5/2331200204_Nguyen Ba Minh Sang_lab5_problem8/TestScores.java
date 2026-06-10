package CSE203.lab5.p8;

public class TestScores {
    private int[] scores;

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        for (int i =0; i < scores.length;i++) {
            if (scores[i] < 0 || scores[i] > 100) {
                throw new InvalidTestScore("Invalid input!");
            }
        }
        this.scores = scores;
    }

    public TestScores(int[] scores) {
        setScores(scores);
    }

    @Override
    public String toString() {
        return "%s".formatted(this.scores);
    }
}
