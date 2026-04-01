package scenario_based.DigitalWallet;

interface TransferService {
    void transfer(User from, User to, double amount) throws InsufficientBalanceException;
}
