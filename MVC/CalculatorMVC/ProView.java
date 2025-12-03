public class ProView  extends CalcView {

    ProView(int num1, int num2) {
        super(num1, num2);
    }

    public void displayProduct(int product) {
        super.displayNumbers();
        System.out.println("The product of the two numbers is: " + product);
    }
    
}
