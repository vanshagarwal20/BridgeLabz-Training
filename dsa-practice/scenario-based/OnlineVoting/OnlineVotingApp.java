package scenario_based.OnlineVoting;

public class OnlineVotingApp {
    public static void main(String[] args) throws Exception {

        Voter v1 = new Voter(1, "Amit");
        Voter v2 = new Voter(2, "Riya");

        Candidate c1 = new Candidate(101, "Candidate A");
        Candidate c2 = new Candidate(102, "Candidate B");

        Election election = new Election();

        election.castVote(v1, c1);
        election.castVote(v2, c2);

        election.showResults();
        c1.displayResult();
        c2.displayResult();
    }
}
