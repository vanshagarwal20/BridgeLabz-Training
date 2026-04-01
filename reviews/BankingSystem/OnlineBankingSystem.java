package reviews.BankingSystem;

public class OnlineBankingSystem {
	public static void main(String[] args){
        Bank bank = new Bank();
        Account a1 = new SavingAccount("Vansh", 10000, "A101");
        Account a2 = new CurrentAccount("Ansh", 5000, "A109");
        bank.createAccount(a1);
        bank.createAccount(a2);
        // Thread 1
        Thread t1 = new Thread(() -> {
            try {
				bank.FundTransfer("A101", "A109", 3000);
			} catch (InsufficientBalanceException e) {
				e.printStackTrace();
			}
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            try {
				bank.FundTransfer("A101", "A109", 4000);
			} catch (InsufficientBalanceException e) {
				e.printStackTrace();
			}
        });
        t1.start();
        t2.start();

        System.out.println("Vansh Balance: " + bank.BalanceCheck("A101"));
        System.out.println("Ansh Balance: " + bank.BalanceCheck("A109"));
    }
	

}
