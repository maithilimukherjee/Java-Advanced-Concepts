import java.util.ArrayList;

public abstract class Payment {
    protected String paymentId;
    protected double amount;
    protected String paymentDate;

    public Payment(String paymentId, double amount, String paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String generateReceipt() {
        return "Receipt:\nPayment ID: " + paymentId + "\nAmount: $" + amount + "\nDate: " + paymentDate;
    }

    public abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCardPayment(String paymentId, double amount, String paymentDate, String cardNumber, String cardHolderName, String expiryDate) {
        super(paymentId, amount, paymentDate);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment for " + cardHolderName);
    }
}

class DebitCardPayment extends Payment {
    private String bankAccount;

    public DebitCardPayment(String paymentId, double amount, String paymentDate, String bankAccount) {
        super(paymentId, amount, paymentDate);
        this.bankAccount = bankAccount;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing debit card payment from account " + bankAccount);
    }
}

class PaymentProcessor {
    private ArrayList<Payment> payments;

    public PaymentProcessor() {
        payments = new ArrayList<>();
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void processPayment(String paymentId) {
        for (Payment payment : payments) {
            if (payment.paymentId.equals(paymentId)) {
                payment.processPayment();
                System.out.println(payment.generateReceipt());
                return;
            }
        }
        System.out.println("Payment ID not found.");
    }

    public void displayAllPayments() {
        for (Payment payment : payments) {
            System.out.println(payment.generateReceipt());
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment creditCardPayment = new CreditCardPayment("CC123", 150.75, "2024-10-01", "1234-5678-9012-3456", "John Doe", "12/25");
        Payment debitCardPayment = new DebitCardPayment("DC456", 200.50, "2024-10-02", "9876543210");

        processor.addPayment(creditCardPayment);
        processor.addPayment(debitCardPayment);

        processor.processPayment("CC123");
        processor.processPayment("DC456");

        processor.displayAllPayments();
    }
}
