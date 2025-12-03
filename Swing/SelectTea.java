import java.awt.BorderLayout;
import javax.swing.*;   

public class SelectTea extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("tea");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.setLocationRelativeTo(null);

            JLabel label = new JLabel("choose your favorite tea:");
            label.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel topPanel = new JPanel(new BorderLayout());
            topPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
            topPanel.add(label, BorderLayout.CENTER);

            frame.add(topPanel, BorderLayout.NORTH);

            JRadioButton blackTeaButton = new JRadioButton("black tea");
            JRadioButton greenTeaButton = new JRadioButton("green tea");
            JRadioButton herbalTeaButton = new JRadioButton("herbal tea");
            JRadioButton chaiLatteButton = new JRadioButton("chai latte");

            ButtonGroup group = new ButtonGroup();
            group.add(blackTeaButton);
            group.add(greenTeaButton);
            group.add(herbalTeaButton);
            group.add(chaiLatteButton);

            JPanel panel = new JPanel();
            panel.add(blackTeaButton);
            panel.add(greenTeaButton);
            panel.add(herbalTeaButton);
            panel.add(chaiLatteButton);

            frame.add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
