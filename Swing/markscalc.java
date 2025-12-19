import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//marks calculator

public class markscalc extends JFrame implements ActionListener
{
    JLabel math, eng, sci, social, totalLabel, percentageLabel, gradeLabel;
    JTextField mathField, engField, sciField, socialField, totalField, percentageField, gradeField;
    JButton calculateButton;

    public markscalc()
    {
        setTitle("marks calculator");
        setSize(500,500);
        setLayout(new GridLayout(8,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        math = new JLabel("Maths:");
        eng = new JLabel("English:");
        sci = new JLabel("Science:");
        social = new JLabel("Social Studies:");
        totalLabel = new JLabel("Total Marks:");
        percentageLabel = new JLabel("Percentage:");
        gradeLabel = new JLabel("Grade:");

        mathField = new JTextField();
        engField = new JTextField();
        sciField = new JTextField();
        socialField = new JTextField();
        totalField = new JTextField();
        totalField.setEditable(false);
        percentageField = new JTextField();

        totalField.setEditable(false);
        percentageField.setEditable(false);
        gradeField = new JTextField();
        gradeField.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        add(math);
        add(mathField);
        add(eng);
        add(engField);
        add(sci);
        add(sciField);
        add(social);
        add(socialField);
        add(totalLabel);
        add(totalField);
        add(percentageLabel);
        add(percentageField);
        add(gradeLabel);
        add(gradeField);
        add(new JLabel());
        add(calculateButton);
        
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        int m = Integer.parseInt(mathField.getText());
        int en = Integer.parseInt(engField.getText());
        int s = Integer.parseInt(sciField.getText());
        int so = Integer.parseInt(socialField.getText());

        int total = m + en + s + so;
        totalField.setText(String.valueOf(total));
        double percentage = (total / 400.0) * 100;
        percentageField.setText(String.format("%.2f", percentage));

        String grade;
        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 80)
            grade = "B";
        else if (percentage >= 70)
            grade = "C";
        else if (percentage >= 60)
            grade = "D";
        else
            grade = "F";
        gradeField.setText(grade);
    }

    public static void main(String[] args)
    {
        new markscalc();
    }
}