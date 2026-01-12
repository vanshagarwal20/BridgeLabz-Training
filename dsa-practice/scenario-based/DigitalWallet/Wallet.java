package scenario_based.DigitalWallet;

import java.util.*;

class Wallet {
    private double balance;
    private List<Transaction> history = new ArrayList<>();

    public Wallet() {
        balance = 0;
    }

    public void addMoney(double amount) {
        balance += amount;
        history.add(new Transaction("Credit", amount));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");

        balance -= amount;
        history.add(new Transaction("Debit", amount));
    }

    public double getBalance() {
        return balance;
    }

    public void showHistory() {
        for (Transaction t : history)
            t.display();
    }
}
