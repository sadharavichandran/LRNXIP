public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber,
                           String holderName,
                           double balance) {

        super(accountNumber, holderName, balance);
    }

    @Override
    public String getAccountType() {
        return "Checking Account";
    }
}