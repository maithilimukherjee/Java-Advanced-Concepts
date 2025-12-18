import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addtwonumbers extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton b;

    addtwonumbers() {
        setTitle("addition");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        JLabel l1 = new JLabel("first number:");
        JLabel l2 = new JLabel("second number:");
        JLabel l3 = new JLabel("sum:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);

        b = new JButton("add");
        b.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int sum = a + b;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new addtwonumbers();
    }
}
