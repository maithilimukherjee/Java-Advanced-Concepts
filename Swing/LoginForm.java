import javax.swing.*;
import java.awt.*;

public class LoginForm {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Set Nimbus *before* creating components
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame("Login Form");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());

            frame.add(new JLabel("Username:"));
            frame.add(new JTextField(15));
            frame.add(new JLabel("Password:"));
            frame.add(new JPasswordField(15));

            JButton loginButton = new JButton("Login");
            JButton cancelButton = new JButton("Cancel");
            frame.add(loginButton);
            frame.add(cancelButton);

            frame.pack();
            frame.setVisible(true);
        });
    }
}
