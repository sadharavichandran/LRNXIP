
import java.io.*;

public class AccountFileManager {

    // Save account details
    public static void saveAccount(Account account) {

        try (BufferedWriter writer =
             new BufferedWriter(
                 new FileWriter("accounts.txt", true))) {

            writer.write(
                account.accountNumber + "," +
                account.holderName + "," +
                account.balance + "," +
                account.getAccountType()
            );

            writer.newLine();

            System.out.println("Account saved successfully!");

        }
        catch (IOException e) {
            System.out.println("File writing error: " + e.getMessage());
        }
    }

    // Read account details
    public static void readAccounts() {

        try (BufferedReader reader =
             new BufferedReader(
                 new FileReader("accounts.txt"))) {

            String line;

            System.out.println("\nSaved Account Details:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
        }
    }
}
