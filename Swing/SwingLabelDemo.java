import javax.swing.*;
import java.awt.event.*;

public class SwingLabelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("label demo");
        JButton button = new JButton("click me");
        JLabel label = new JLabel("waiting...");

        button.addActionListener(e -> label.setText("button clicked!"));

        frame.setLayout(new java.awt.FlowLayout()); // simple layout
        frame.add(button);
        frame.add(label);

        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
