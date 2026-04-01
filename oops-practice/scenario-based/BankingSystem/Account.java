package scenario_based.BankingSystem;
import java.util.*;

abstract class Account{
	private String name;
	private double balance;
	private String accountNo;
	
	LinkedList<String> history =new LinkedList<>();
	
	public Account(String name, double balance, String accountNo) {
		this.name = name;
		setBalance(balance);
		this.accountNo = accountNo;
	}
	
	public double getBalance() {		
		return balance;		
	}
	
	public String getAcc() {		
		return accountNo;
	}
	
	public void setBalance( double balance){
		if(balance>0) {			
			this.balance=balance;
		}
		else {
			System.out.println("Invalid");			
		}
	}
	
	void addTransaction(String msg) {		
		history.add(msg);		
	}
	
	public abstract double CalculateInterest();
	
	public void Deposit(double amount){	
		balance=balance+amount;
		System.out.println("Money Deposited");		
	}
	
	public  synchronized void withdraw(double amount) throws InsufficientBalanceException{		
		if(amount>balance){
			throw new InsufficientBalanceException("Insufficinet Balance");	
		}
		else {
			balance=balance-amount;
			System.out.println("Balance Withdrawn");
	        addTransaction("Withdrawn: " + amount);			
		}
	}
}
