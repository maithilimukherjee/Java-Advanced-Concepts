import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class markscalc2 extends JFrame implements ActionListener
{
    JLabel math, eng, sci, social, totalLabel, percentageLabel, gradeLabel;
    JTextField mathField, engField, sciField, socialField, totalField, percentageField, gradeField;
    JButton calculateButton;

    public markscalc2()
    {
        setTitle("marks calculator");
        setSize(500, 500);
        setLayout(new BorderLayout(10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // labels
        math = new JLabel("maths:");
        eng = new JLabel("english:");
        sci = new JLabel("science:");
        social = new JLabel("social:");
        totalLabel = new JLabel("total:");
        percentageLabel = new JLabel("percentage:");
        gradeLabel = new JLabel("grade:");

        // textfields
        mathField = new JTextField();
        engField = new JTextField();
        sciField = new JTextField();
        socialField = new JTextField();
        totalField = new JTextField();
        percentageField = new JTextField();
        gradeField = new JTextField();

        totalField.setEditable(false);
        percentageField.setEditable(false);
        gradeField.setEditable(false);

        // center panel (form)
        JPanel centerPanel = new JPanel(new GridLayout(7, 2, 5, 5));
        centerPanel.add(math);
        centerPanel.add(mathField);
        centerPanel.add(eng);
        centerPanel.add(engField);
        centerPanel.add(sci);
        centerPanel.add(sciField);
        centerPanel.add(social);
        centerPanel.add(socialField);
        centerPanel.add(totalLabel);
        centerPanel.add(totalField);
        centerPanel.add(percentageLabel);
        centerPanel.add(percentageField);
        centerPanel.add(gradeLabel);
        centerPanel.add(gradeField);

        // button panel
        calculateButton = new JButton("calculate");
        calculateButton.addActionListener(this);
        JPanel southPanel = new JPanel();
        southPanel.add(calculateButton);

        // add to frame
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int m = Integer.parseInt(mathField.getText());
        int en = Integer.parseInt(engField.getText());
        int s = Integer.parseInt(sciField.getText());
        int so = Integer.parseInt(socialField.getText());

        int total = m + en + s + so;
        double percentage = (total / 400.0) * 100;

        totalField.setText(String.valueOf(total));
        percentageField.setText(String.format("%.2f", percentage));

        String grade;
        if (percentage >= 90)
            grade = "a";
        else if (percentage >= 80)
            grade = "b";
        else if (percentage >= 70)
            grade = "c";
        else if (percentage >= 60)
            grade = "d";
        else
            grade = "f";

        gradeField.setText(grade);
    }

    public static void main(String[] args)
    {
        new markscalc2();
    }
}
