package scenario_based.BankingSystem;


class CurrentAccount extends Account {

	public CurrentAccount(String name, double balance, String accountNo) {
		super(name, balance, accountNo);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double CalculateInterest() {
		// TODO Auto-generated method stub
		return getBalance()*0.01;
	}
	
}


