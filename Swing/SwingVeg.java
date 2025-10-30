import javax.swing.*;
import java.awt.*;

public class SwingVeg {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Vegetable Selector");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());

            JLabel label = new JLabel("Select food preference: ");
            JComboBox<String> foodCombo = new JComboBox<>(new String[]{
                "Vegetarian", "Non-Vegetarian", "Vegan"
            });

            JButton submitButton = new JButton("Submit");
            submitButton.addActionListener(e -> {
                String choice = (String) foodCombo.getSelectedItem();
                JOptionPane.showMessageDialog(
                        frame,
                        "You selected: " + choice + "\nFood Preference Noted!",
                        "Selection",
                        JOptionPane.INFORMATION_MESSAGE
                );
            });

            frame.add(label);
            frame.add(foodCombo);
            frame.add(submitButton);

            frame.setVisible(true);
        });
    }
}
