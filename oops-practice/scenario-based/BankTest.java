package scenario_based;

class BankAccount {
    private String accountNumber;
    private double balance;

//     Constructor
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

//     Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

//     Withdraw method (Overdraft prevention)
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

//     Check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC123", 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500); // overdraft attempt
        acc.checkBalance();
    }

}
