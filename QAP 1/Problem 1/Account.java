public class Account {

    // Instance variables
    private String accountNumber;
    private double balance;

    // Default constructor
    public Account() {
        accountNumber = "0000";
        balance = 0.0;
    }

    // Parameterized constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Transfer money to another account
    public void transfer(Account anotherAccount,
                         double amount) {

        if (amount > 0 && amount <= balance) {

            this.withdraw(amount);
            anotherAccount.deposit(amount);
        }
    }

    // toString method
    @Override
    public String toString() {

        return "Account Number: "
                + accountNumber
                + ", Balance: $"
                + balance;
    }
}