public class BankingTest {

    public static void main(String[] args) {

        SavingsAccount acc1 =
            new SavingsAccount("1001", "Ravi", 5000);

        CheckingAccount acc2 =
            new CheckingAccount("1002", "Kumar", 3000);

        try {

            acc1.deposit(2000);

            acc1.withdraw(1000);

            acc1.transfer(acc2, 2000);

            // Testing insufficient balance
            acc1.withdraw(10000);

        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InvalidAccountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nFinal Account Details:");

        acc1.displayDetails();
        acc2.displayDetails();
        // Save accounts
AccountFileManager.saveAccount(acc1);
AccountFileManager.saveAccount(acc2);

// Read saved accounts
AccountFileManager.readAccounts();
    }
}