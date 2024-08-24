// Class
public class Bank {
    // Fields
    private String accountType;
    private double accountBalance;

    // Method to deposit money into the account
    public double deposit(double amount) {
        // Ensure the deposit amount is positive
        if (amount > 0) {
            accountBalance += amount;
        }
        else {
            System.out.println("Invalid amount!");
        }
        // Return the updated account balance
        return accountBalance;
    }
}