import javax.swing.*;
import java.awt.*;

public class JDialogDemo {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JDialog Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());

            JButton showDialogButton = new JButton("Show Dialog");
            showDialogButton.addActionListener(e -> {
                JDialog dialog = new JDialog(frame, "Dialog", true);
                dialog.setLayout(new FlowLayout());
                dialog.add(new JLabel("This is a modal dialog"));
                JButton closeButton = new JButton("Close");
                closeButton.addActionListener(ev -> dialog.dispose());
                dialog.add(closeButton);
                dialog.setSize(200, 100);
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            });

            frame.add(showDialogButton);
            frame.setVisible(true);
        });
    }
}
