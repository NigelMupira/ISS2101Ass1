// Class
public class Bank {
    // Fields
    private String accountType;
    private double accountBalance;

    // Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

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

    // Method to withdraw money from the account
    public double withdrawal(double amount) {
        // Ensure the withdrawal amount is positive and does not exceed the account balance
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        }
        else {
            System.out.println("Invalid transaction!");
        }
        // Return the updated account balance
        return accountBalance;
    }

    // Method to display the account details
    public void display() {
        System.out.println("You have a " + accountType + " account and the balance is " + accountBalance);
    }
}