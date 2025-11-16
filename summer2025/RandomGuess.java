import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10... got it?");
        int number = 1 + (int)(Math.random() * 10);
        JOptionPane.showMessageDialog(null, "Okay, here's my guess: " + number);
    }
}
