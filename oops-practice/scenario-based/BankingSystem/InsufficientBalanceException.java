package scenario_based.BankingSystem;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message){		
		super(message);	
	}
	
}
