package inheritance;

//	Superclass
	class BankAccount {
	 String accountNumber;
	 double balance;
	
	 BankAccount(String accountNumber, double balance) {
	     this.accountNumber = accountNumber;
	     this.balance = balance;
	 }
	}
	
//	Savings Account subclass
	class SavingsAccount extends BankAccount {
	 double interestRate;
	
	 SavingsAccount(String accountNumber, double balance, double interestRate) {
	     super(accountNumber, balance);
	     this.interestRate = interestRate;
	 }
	
	 void displayAccountType() {
	     System.out.println("Account Type: Savings Account");
	     System.out.println("Interest Rate: " + interestRate + "%");
	 }
	}
	
//	Checking Account subclass
	class CheckingAccount extends BankAccount {
	 double withdrawalLimit;
	
	 CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
	     super(accountNumber, balance);
	     this.withdrawalLimit = withdrawalLimit;
	 }
	
	 void displayAccountType() {
	     System.out.println("Account Type: Checking Account");
	     System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
	 }
	}
	
//	Fixed Deposit Account subclass
	class FixedDepositAccount extends BankAccount {
	 int tenure; // in years
	
	 FixedDepositAccount(String accountNumber, double balance, int tenure) {
	     super(accountNumber, balance);
	     this.tenure = tenure;
	 }
	
	 void displayAccountType() {
	     System.out.println("Account Type: Fixed Deposit Account");
	     System.out.println("Tenure: " + tenure + " years");
	 }
	}
	
	//Main class
	public class BankSystem {
	 public static void main(String[] args) {
	
	     SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
	     CheckingAccount ca = new CheckingAccount("CA201", 30000, 20000);
	     FixedDepositAccount fd = new FixedDepositAccount("FD301", 100000, 5);
	
	     sa.displayAccountType();
	     System.out.println();
	
	     ca.displayAccountType();
	     System.out.println();
	
	     fd.displayAccountType();
	 }

}
