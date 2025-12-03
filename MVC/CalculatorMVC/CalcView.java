public class CalcView {
    
    int num1;
    int num2;

    CalcView(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void displayNumbers()
    {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

}
