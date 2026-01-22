package Insurance_Policy_Management;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class WithdrawalRequest {
    String accountNumber;
    double amount;
    public WithdrawalRequest(String acc, double amt){ accountNumber = acc; amount = amt;}
    @Override
    public String toString(){ return accountNumber + " : " + amount; }
}

public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, List<String>> sortedAccounts = new TreeMap<>();
    private Queue<WithdrawalRequest> queue = new LinkedList<>();

    public void addAccount(String acc, double balance) {
        accounts.put(acc, balance);
        sortedAccounts.computeIfAbsent(balance, k -> new ArrayList<>()).add(acc);
    }

    public void requestWithdrawal(String acc, double amt) {
        queue.add(new WithdrawalRequest(acc, amt));
    }

    public void processQueue() {
        while(!queue.isEmpty()){
            WithdrawalRequest req = queue.remove();
            accounts.put(req.accountNumber, accounts.getOrDefault(req.accountNumber,0.0) - req.amount);
            System.out.println("Processed: " + req);
        }
    }

    public void displayAccounts() {
        System.out.println("Accounts: " + accounts);
        System.out.println("Sorted by balance: " + sortedAccounts);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount("A101", 10000);
        bank.addAccount("B102", 5000);
        bank.addAccount("C103", 15000);

        bank.requestWithdrawal("A101", 2000);
        bank.requestWithdrawal("B102", 1000);
        bank.processQueue();
        bank.displayAccounts();
    }
}

