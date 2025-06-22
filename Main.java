import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        if (name != null && !name.trim().isEmpty()) {
            Player player = new Player(name);
            new Game(player);
        }
    }
}