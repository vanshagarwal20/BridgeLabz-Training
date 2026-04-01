package encapsulations;

import java.util.*;

//	Interface for loanable accounts
	interface Loanable {
	 void applyForLoan(double amount);
	 double calculateLoanEligibility();
	}
	
//	Abstract BankAccount class
	abstract class BankAccount {
	 private String accountNumber;
	 private String holderName;
	 protected double balance; // accessible in subclasses
	
	 public BankAccount(String accountNumber, String holderName, double balance) {
	     this.accountNumber = accountNumber;
	     this.holderName = holderName;
	     this.balance = balance;
	 }
	
//	  Encapsulation
	 public String getAccountNumber() { return accountNumber; }
	 public String getHolderName() { return holderName; }
	 public double getBalance() { return balance; }
	
//	  Concrete methods
	 public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println(amount + " deposited. New Balance: " + balance);
	     } else {
	         System.out.println("Invalid deposit amount");
	     }
	 }
	
	 public void withdraw(double amount) {
	     if (amount > 0 && amount <= balance) {
	         balance -= amount;
	         System.out.println(amount + " withdrawn. New Balance: " + balance);
	     } else {
	         System.out.println("Invalid or insufficient balance");
	     }
	 }
	
//	  Abstract method for interest
	 public abstract double calculateInterest();
	
//	  Display account details
	 public void displayDetails() {
	     System.out.println("Account Number : " + accountNumber);
	     System.out.println("Holder Name    : " + holderName);
	     System.out.println("Balance        : " + balance);
	 }
	}
	
//	SavingsAccount with interest
	class SavingsAccount extends BankAccount implements Loanable {
	 private double interestRate; // annual %
	
	 public SavingsAccount(String accNum, String holderName, double balance, double interestRate) {
	     super(accNum, holderName, balance);
	     this.interestRate = interestRate;
	 }
	
	 @Override
	 public double calculateInterest() {
	     return balance * interestRate / 100;
	 }
	
	 @Override
	 public void applyForLoan(double amount) {
	     System.out.println("Loan of " + amount + " applied for Savings Account: " + getAccountNumber());
	 }
	
	 @Override
	 public double calculateLoanEligibility() {
	     return balance * 0.5; // eligible for 50% of balance
	 }
	}
	
//	CurrentAccount with lower interest
	class CurrentAccount extends BankAccount implements Loanable {
	 private double interestRate; // very low or zero
	
	 public CurrentAccount(String accNum, String holderName, double balance, double interestRate) {
	     super(accNum, holderName, balance);
	     this.interestRate = interestRate;
	 }
	
	 @Override
	 public double calculateInterest() {
	     return balance * interestRate / 100;
	 }
	
	 @Override
	 public void applyForLoan(double amount) {
	     System.out.println("Loan of " + amount + " applied for Current Account: " + getAccountNumber());
	 }
	
	 @Override
	 public double calculateLoanEligibility() {
	     return balance * 0.3; // eligible for 30% of balance
	 }
	}
	
//	Main class
	public class BankingSystem {
	 public static void main(String[] args) {
	     List<BankAccount> accounts = new ArrayList<>();
	
	     BankAccount acc1 = new SavingsAccount("SA101", "Vansh", 50000, 6);
	     BankAccount acc2 = new CurrentAccount("CA202", "Amit", 30000, 2);
	
	     accounts.add(acc1);
	     accounts.add(acc2);
	
	     for (BankAccount acc : accounts) {
	         acc.displayDetails();
	         System.out.println("Calculated Interest: " + acc.calculateInterest());
	
	         if (acc instanceof Loanable) {
	             Loanable loanAcc = (Loanable) acc;
	             System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
	             loanAcc.applyForLoan(10000);
	         }
	
	         System.out.println();
	     }
	
//	      Demo deposit and withdraw
	     acc1.deposit(5000);
	     acc2.withdraw(10000);
	 }
	}

