import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Action extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("button action");
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            frame.setLocationRelativeTo(null);

            JButton button = new JButton("click me");
            JLabel label = new JLabel("button not clicked");

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText("button clicked");
                }
            });

            frame.add(button);
            frame.add(label);
            frame.setVisible(true);
        });
    }
}