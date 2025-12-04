import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("key event demo");
        JLabel label = new JLabel("type a key...");
        
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText("key pressed: " + e.getKeyChar());
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(label);

        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setFocusable(true);   // important for key events
        frame.requestFocusInWindow();
    }
}
