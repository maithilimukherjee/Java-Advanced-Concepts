public class CalcController {

    // polymorphic method: works with any Operation model and any CalcView
    public void performOperation(Operation op, char operator, CalcView view) {
        double result = op.calculate(operator);  // compute result

        // determine which view to use for displaying the result
        if (view instanceof DivView) {
            ((DivView) view).displayQuotient(result);
        } else if (view instanceof ProView) {
            ((ProView) view).displayProduct((int) result);
        } else if (view instanceof DiffView) {
            ((DiffView) view).displayDifference((int) result);
        } else if (view instanceof SumView) {
            ((SumView) view).displaySum((int) result);
        } else {
            System.out.println("unsupported view type");
        }
    }
}
