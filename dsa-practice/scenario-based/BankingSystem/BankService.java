package scenario_based.BankingSystem;


public interface BankService {
	void createAccount(Account acc);
 	double BalanceCheck(String AccNumber);
	void FundTransfer(String from , String to , double balance) throws InsufficientBalanceException;	
}
