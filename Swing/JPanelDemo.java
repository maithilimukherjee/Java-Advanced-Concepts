import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JPanel Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JPanel top = new JPanel(new FlowLayout());
            top.add(new JLabel("Enter Username: "));
            top.add(new JTextField(15));

            JPanel bottom = new JPanel(new FlowLayout());
            bottom.add(new JButton("Login"));
            bottom.add(new JButton("Cancel"));

            frame.setLayout(new BorderLayout());
            frame.add(top, BorderLayout.NORTH);
            frame.add(bottom, BorderLayout.SOUTH);

            frame.pack();
            frame.setVisible(true);
            
        });
    }
}
