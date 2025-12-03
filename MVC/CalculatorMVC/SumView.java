public class SumView extends CalcView {

    SumView(int num1, int num2) {
        super(num1, num2);
    }

    public void displaySum(int sum) {
        super.displayNumbers();
        System.out.println("The sum of the two numbers is: " + sum);
    }
}