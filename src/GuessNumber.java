import javax.swing.*;
public class GuessNumber {
    int countOfAttempts = 0;
    int countOfAttemptsLeft = 5;
    int userNumber;
    public void run() {
        int randomNumber = (int) (Math.random() * 10);
        JLabel label = new JLabel("Hello, I want to play a game with you. If you ready, type OK below");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JOptionPane.showMessageDialog(null, label, "Guess a number", JOptionPane.INFORMATION_MESSAGE);
        while (countOfAttemptsLeft >= 0) {
            userNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Type here your value"));
            if(userNumber != randomNumber) {
                JOptionPane.showMessageDialog(null, "Try again." +
                        " You have " + countOfAttemptsLeft + " attempts");
                countOfAttempts++;
                if(countOfAttemptsLeft == 0) {
                    JOptionPane.showMessageDialog(null, "You lose");
                };
                countOfAttemptsLeft--;
            } else {
                JOptionPane.showMessageDialog(null, "You win. You needed " + countOfAttempts + " attempts");
                break;
            };
        };
    };
};