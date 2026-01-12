package scenario_based.OnlineVoting;

interface ElectionService {
    void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException;
    void showResults();
}
