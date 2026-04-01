package scenario_based.OnlineVoting;

class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String msg) {
        super(msg);
    }
}
