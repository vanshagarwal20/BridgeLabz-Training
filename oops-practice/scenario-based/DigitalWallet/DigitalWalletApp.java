package scenario_based.DigitalWallet;

public class DigitalWalletApp {
    public static void main(String[] args) throws Exception {

        User u1 = new User(1, "Aman");
        User u2 = new User(2, "Riya");

        u1.getWallet().addMoney(1000);

        TransferService walletTransfer = new WalletTransfer();
        walletTransfer.transfer(u1, u2, 300);

        System.out.println("Vansh Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Ansh Balance: ₹" + u2.getWallet().getBalance());

        System.out.println("Vansh Transaction History:");
        u1.getWallet().showHistory();
    }
}
