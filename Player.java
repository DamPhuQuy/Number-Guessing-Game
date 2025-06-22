public class Player {
    private String name;
    private int score;
    private int attempts;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.attempts = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        if (attempts < 1) {
            return score = 1000;
        }
        else if (attempts > 1 && attempts < 4) {
            return score = 750;
        }
        else {
            return score = 500;
        }
    }

    public void incrementAttempts() {
        ++attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}
