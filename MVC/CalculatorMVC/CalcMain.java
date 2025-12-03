public class CalcMain {
    public static void main(String[] args) {

        Operation op = new Operation(11, 5);  // model
        CalcController controller = new CalcController(); // controller

        // sum
        SumView sumView = new SumView(op.getNum1(), op.getNum2());
        controller.performOperation(op, '+', sumView);

        // difference
        DiffView diffView = new DiffView(op.getNum1(), op.getNum2());
        controller.performOperation(op, '-', diffView);

        // product
        ProView proView = new ProView(op.getNum1(), op.getNum2());
        controller.performOperation(op, '*', proView);

        // division
        DivView divView = new DivView(op.getNum1(), op.getNum2());
        controller.performOperation(op, '/', divView);
    }
}
