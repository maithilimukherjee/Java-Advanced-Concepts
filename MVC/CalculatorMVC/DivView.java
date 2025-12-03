public class DivView extends CalcView {

    DivView(int num1, int num2) {
        super(num1, num2);
    }

    public void displayQuotient(double quotient) {
        super.displayNumbers();
        System.out.println("The result of the two numbers is: " + quotient);

    }
    
}
