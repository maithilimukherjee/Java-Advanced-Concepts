import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JComponents {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JComponents Example");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello, Swing Components!");
        JButton button = new JButton("Click Me");

        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
