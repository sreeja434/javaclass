public class BankAccount {
    // Account details
    String accountHolder;
    double balance;
    int transactions;
    boolean isActive;

    // Constructor
    public BankAccount(String name, double initialBalance, boolean status) {
        accountHolder = name;
        balance = initialBalance;
        isActive = status;
        transactions = 0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0 && isActive) { // Logical operation
            balance += amount;        // Arithmetic
            transactions++;           // Increment
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && isActive && balance >= amount) {
            balance -= amount;
            transactions++;
        }
    }

    // Print summary
    public void printSummary() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Transactions: " + transactions);

        // Relational operation
        if (balance < 100) {
            System.out.println("Warning: Balance below minimum threshold!");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 200.0, true);
        acc.deposit(150.0);
        acc.withdraw(50.0);
        acc.withdraw(300.0); // should not proceed
        acc.printSummary();
    }
}
