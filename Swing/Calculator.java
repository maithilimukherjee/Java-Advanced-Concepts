import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField displayField;

    private double firstOperand = 0;
    private double secondOperand = 0;
    private String operator = "";
    private boolean isOperatorPressed = false;

    private String expression = ""; // stores the visible full expression

    public Calculator() {
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display field
        displayField = new JTextField();
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        add(displayField, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        add(buttonPanel, BorderLayout.CENTER);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 22));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        // Clear button
        if (input.equals("C")) {
            clear();
            return;
        }

        // Digits and decimal
        if (isDigitOrDecimal(input)) {
            if (isOperatorPressed) {
                displayField.setText("");
                isOperatorPressed = false;
            }
            displayField.setText(displayField.getText() + input);
            return;
        }

        // Operators
        if (isOperator(input)) {
            try {
                firstOperand = Double.parseDouble(displayField.getText());
            } catch (Exception ex) {
                displayField.setText("Error");
                return;
            }
            operator = input;
            expression = firstOperand + " " + operator + " ";  // build visible expression
            isOperatorPressed = true;
            return;
        }

        // Equals (=) logic
        if (input.equals("=")) {
            try {
                secondOperand = Double.parseDouble(displayField.getText());
                double result = computeResult();

                // Build final expression output
                expression = firstOperand + " " + operator + " " + secondOperand + " = " + result;

                displayField.setText(expression);
            } catch (ArithmeticException ex) {
                displayField.setText("Math Error");
            } catch (Exception ex) {
                displayField.setText("Error");
            }
        }
    }

    // Compute arithmetic result
    private double computeResult() {
        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return firstOperand / secondOperand;
        }
        return 0;
    }

    // Clear everything
    private void clear() {
        displayField.setText("");
        firstOperand = 0;
        secondOperand = 0;
        operator = "";
        expression = "";
        isOperatorPressed = false;
    }

    // Helper: digit or decimal
    private boolean isDigitOrDecimal(String s) {
        return s.matches("\\d") || s.equals(".");
    }

    // Helper: operator
    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
