import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.TextField;
public class ComponentDemo {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new JFrame("Component Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLayout(new FlowLayout());

            frame.add(new JLabel("Name: "));
            frame.add(new TextField(20));
            frame.add(new JButton("Submit"));
            frame.add(new JCheckBox("I agree to the terms and conditions"));

            frame.pack();
            frame.setVisible(true);
        });
    }
}
