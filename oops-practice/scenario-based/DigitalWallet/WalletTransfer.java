package scenario_based.DigitalWallet;

class WalletTransfer implements TransferService {

    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.getWallet().withdrawMoney(amount);
        to.getWallet().addMoney(amount);
        System.out.println("Wallet to Wallet Transfer Successful");
    }
}
