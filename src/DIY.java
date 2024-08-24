// Experiment to test the water

class Banga {
    // Fields
    private String accountType;
    private double accountBalance;

    // Default Constructor
    public Banga() {
        this.accountType = "Savings"; // Default account type
        this.accountBalance = 0.0; // Default balance
    }

    // Parameterized Constructor
    public Banga(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Getters
    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Setters
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // toString method (optional, for easy display)
    @Override
    public String toString() {
        return "Bank Account [Account Type: " + accountType + ", Account Balance: " + accountBalance + "]";
    }

    // Main method for testing (optional)
    public static void main(String[] args) {
        // Using the default constructor
        Banga account1 = new Banga();
        System.out.println(account1);

        // Using the parameterized constructor
        Banga account2 = new Banga("Checking", 500.75);
        System.out.println(account2);

        // Modifying the account details
        account2.setAccountType("Savings");
        account2.setAccountBalance(1000.50);
        System.out.println("Updated Account: " + account2);
    }
}