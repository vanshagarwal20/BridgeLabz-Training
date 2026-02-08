package multi_threading_practice;

import java.time.LocalDateTime;

public class BankingSystem {

    // BankAccount as inner class
    class BankAccount {
        private int balance = 10000;

        public int getBalance() {
            return balance;
        }

        // Not synchronized (to observe race condition)
        public boolean withdraw(int amount) {
            if (balance >= amount) {
                try {
                    Thread.sleep(200); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= amount;
                return true;
            }
            return false;
        }
    }

    // Transaction as inner class
    class Transaction implements Runnable {
        private BankAccount account;
        private String customerName;
        private int amount;

        public Transaction(BankAccount account, String customerName, int amount) {
            this.account = account;
            this.customerName = customerName;
            this.amount = amount;
        }

        @Override
        public void run() {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Attempting to withdraw " + amount);

            boolean success = account.withdraw(amount);

            if (success) {
                System.out.println("Transaction successful: " + customerName +
                        ", Amount: " + amount +
                        ", Balance: " + account.getBalance() +
                        ", Time: " + LocalDateTime.now());
            } else {
                System.out.println("Transaction failed: " + customerName +
                        ", Amount: " + amount +
                        ", Balance: " + account.getBalance() +
                        ", Time: " + LocalDateTime.now());
            }
        }
    }

    public static void main(String[] args) {

        BankingSystem system = new BankingSystem();
        BankAccount account = system.new BankAccount();

        Thread t1 = new Thread(system.new Transaction(account, "Customer-1", 3000), "Customer-1");
        Thread t2 = new Thread(system.new Transaction(account, "Customer-2", 4000), "Customer-2");
        Thread t3 = new Thread(system.new Transaction(account, "Customer-3", 2000), "Customer-3");
        Thread t4 = new Thread(system.new Transaction(account, "Customer-4", 5000), "Customer-4");
        Thread t5 = new Thread(system.new Transaction(account, "Customer-5", 1500), "Customer-5");

        // Thread states before execution
        System.out.println(t1.getName() + " state: " + t1.getState());
        System.out.println(t2.getName() + " state: " + t2.getState());
        System.out.println(t3.getName() + " state: " + t3.getState());
        System.out.println(t4.getName() + " state: " + t4.getState());
        System.out.println(t5.getName() + " state: " + t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

