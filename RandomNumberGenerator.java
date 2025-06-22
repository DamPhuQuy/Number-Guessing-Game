import java.util.Random;

public class RandomNumberGenerator {
    private int numberToGuess;

    public RandomNumberGenerator() {
        Random random = new Random();
        this.numberToGuess = random.nextInt(1000) + 1;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }
}
