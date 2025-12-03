import javax.swing.*;

public class Form extends JFrame {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("my form");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);

            JLabel label = new JLabel("fill in the form below:");
            label.setBounds(120, 20, 200, 30);
            frame.add(label);

            JLabel nameLabel = new JLabel("name:");
            nameLabel.setBounds(50, 80, 100, 30);
            frame.add(nameLabel);

            JTextField nameField = new JTextField(10);
            nameField.setBounds(150, 80, 150, 30);
            frame.add(nameField);

            JLabel phoneLabel = new JLabel("phone:");
            phoneLabel.setBounds(50, 130, 100, 30);
            frame.add(phoneLabel);

            JTextField phoneField = new JTextField(10);
            phoneField.setBounds(150, 130, 150, 30);
            frame.add(phoneField);

            JLabel genderLabel = new JLabel("gender:");
            genderLabel.setBounds(50, 180, 100, 30);
            frame.add(genderLabel);

            JRadioButton maleButton = new JRadioButton("male");
            maleButton.setBounds(150, 180, 80, 30);

            JRadioButton femaleButton = new JRadioButton("female");
            femaleButton.setBounds(230, 180, 80, 30);

            ButtonGroup group = new ButtonGroup();
            group.add(maleButton);
            group.add(femaleButton);

            frame.add(maleButton);
            frame.add(femaleButton);

            frame.setVisible(true);
        });
    }
}
