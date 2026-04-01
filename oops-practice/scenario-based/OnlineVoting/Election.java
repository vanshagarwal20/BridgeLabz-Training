package scenario_based.OnlineVoting;

import java.util.*;

class Election implements ElectionService {

    private List<Vote> votes = new ArrayList<>();

    public void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException {

        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter has already voted");
        }

        votes.add(new Vote(voter, candidate));
        voter.markVoted();
        candidate.addVote();
    }

    public void showResults() {
        System.out.println("Election Results Declared");
    }
}
