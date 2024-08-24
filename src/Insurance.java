public class Insurance extends Bank {
    // Constructor for the Insurance class
    public Insurance(String accountType, double accountBalance) {
        // Call the constructor of the Bank class (superclass)
        super(accountType, accountBalance);
    }

    // Method to print "You are covered"
    public void cover() {
        System.out.println("You are covered");
    }
}