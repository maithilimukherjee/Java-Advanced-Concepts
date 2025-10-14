package CollegeAssignments;

public class BankAccount {
    
    private String acHolderName;
    private String acNumber;
    private String acType;
    private double balance;

    public BankAccount(String name, String number, String type, double initialBalance) {
        this.acHolderName = name;
        this.acNumber = number;
        this.acType = type;
        this.balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void withdraw(double amount)
    {
        if (amount > balance)
        {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
            System.out.println("New balance: " + checkBalance());
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
            System.out.println("New balance: " + checkBalance());
        }
    }
}

class BankMain
{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", "Savings", 1000.0);

        System.out.println("Initial Balance: " + account.checkBalance());

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0); // Attempt to withdraw more than the balance
    }
}