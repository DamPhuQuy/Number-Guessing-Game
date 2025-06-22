import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private RandomNumberGenerator generator;
    private Player player;

    private JLabel label;
    private JTextField inputField;
    private JButton guessButton;
    private JLabel feedbackLabel;

    public Game(Player player) {
        this.player = player;
        this.generator = new RandomNumberGenerator();

        setTitle("Number Guessing Game");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        label = new JLabel("Guess a number between 1 and 100:");
        inputField = new JTextField();
        guessButton = new JButton("Guess");
        feedbackLabel = new JLabel("");

        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        add(label);
        add(inputField);
        add(guessButton);
        add(feedbackLabel);

        setLocationRelativeTo(null); // center window
        setVisible(true);
    }

    private void start() {
        String userInput = inputField.getText();
        try {
            int guess = Integer.parseInt(userInput);
            player.incrementAttempts();

            if (guess == generator.getNumberToGuess()) {
                feedbackLabel.setText("Correct! Attempts: " + player.getAttempts());
                guessButton.setEnabled(false);
            } else if (guess < generator.getNumberToGuess()) {
                feedbackLabel.setText("Too low! Try again.");
            } else {
                feedbackLabel.setText("Too high! Try again.");
            }

        } catch (NumberFormatException e) {
            feedbackLabel.setText("Please enter a valid number.");
        }
    }
}
