
public abstract class Account {

    protected String accountNumber;
    protected String holderName;
    protected double balance;

    // Constructor
    public Account(String accountNumber,
                   String holderName,
                   double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Abstract method
    public abstract String getAccountType();

    // Display account details
    public void displayDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    // Deposit method
    public void deposit(double amount)
            throws InvalidAccountException {

        if (amount <= 0) {
            throw new InvalidAccountException(
                "Deposit amount must be positive!"
            );
        }

        balance += amount;

        System.out.println("Deposit successful!");
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientBalanceException,
                   InvalidAccountException {

        if (amount <= 0) {
            throw new InvalidAccountException(
                "Invalid withdrawal amount!"
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance -= amount;

        System.out.println("Withdrawal successful!");
    }

    // Transfer method
    public void transfer(Account targetAccount, double amount)
            throws InsufficientBalanceException,
                   InvalidAccountException {

        if (targetAccount == null || amount <= 0) {
            throw new InvalidAccountException(
                "Invalid account or transfer amount!"
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance for transfer!"
            );
        }

        balance -= amount;
        targetAccount.balance += amount;

        System.out.println("Transfer successful!");
    }
}
