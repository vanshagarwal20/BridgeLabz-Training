package reviews.BankingSystem;

import java.util.*;

class Bank implements BankService{	
	HashMap<String, Account> h=new HashMap<>();	

	@Override
	public void createAccount(Account acc) {
		// TODO Auto-generated method stub
		h.put(acc.getAcc(),acc);
		System.out.println("Account Created");		
	}

	@Override
	public double BalanceCheck(String AccNumber){
		// TODO Auto-generated method stub
		return h.get(AccNumber).getBalance();
	}

	@Override
	public void FundTransfer(String from, String to, double balance) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		Account a1=h.get(to);
		Account a2=h.get(from);
		
		synchronized(this) {			
			try {				
				a2.withdraw(balance);
				a1.Deposit(balance);
				
				System.out.println("Transfer Successful: " + balance);
			}
			catch(Exception e){				
				System.out.println(e.getMessage());
			}
		}		
	}
	
}
