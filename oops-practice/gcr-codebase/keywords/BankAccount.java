package keywords;

public class BankAccount {

//	     Static variables
	    private static String bankName = "State bank of India";
	    private static int totalAccounts = 0;

//	     Final variable
	    private final String accountNumber;

//	     Instance variables
	    private String accountHolderName;
	    private double balance;

//	     Constructor using 'this'
	    public BankAccount(String accountHolderName, String accountNumber, double balance) {
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        totalAccounts++;
	    }

//	     Static method
	    public static void getTotalAccounts() {
	        System.out.println("Total number of accounts: " + totalAccounts);
	    }

//	     Display method using instance of
	    public void displayAccountDetails() {
	        if (this instanceof BankAccount) {
	            System.out.println("Bank Name: " + bankName);
	            System.out.println("Account Holder: " + accountHolderName);
	            System.out.println("Account Number: " + accountNumber);
	            System.out.println("Balance: $" + balance);
	        }
	    }

//	     Deposit method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

//	     Withdraw method
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.err.println("Insufficient balance or invalid amount.");
	        }
	    }

//	     Main method
	    public static void main(String[] args) {

	        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000);
	        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500);

	        System.out.println("Account 1 Details:");
	        account1.displayAccountDetails();

	        System.out.println("Account 2 Details:");
	        account2.displayAccountDetails();

	        BankAccount.getTotalAccounts();

	        System.out.println("Performing transactions on Account 1:");
	        account1.deposit(200);
	        account1.withdraw(150);
	        account1.displayAccountDetails();

	        account2.displayAccountDetails();
	        account2.deposit(100);
	        account2.withdraw(800);
	    }

}
