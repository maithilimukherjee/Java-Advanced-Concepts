public class Operation {
    private int num1;
    private int num2;

    // constructor
    public Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // getters & setters (encapsulation)
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
    public void setNum1(int num1) { this.num1 = num1; }
    public void setNum2(int num2) { this.num2 = num2; }

    // simple calculate method using switch-case
    public double calculate(char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0)
                    throw new ArithmeticException("division by zero is not allowed");
                return (double) num1 / num2;
            default:
                throw new IllegalArgumentException("invalid operator: " + operator);
        }
    }
}
