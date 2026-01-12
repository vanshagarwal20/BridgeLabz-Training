package scenario_based.OnlineVoting;

class Vote {
    private Voter voter;
    private Candidate candidate;

    public Vote(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }
}
