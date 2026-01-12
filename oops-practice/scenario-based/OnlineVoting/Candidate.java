package scenario_based.OnlineVoting;

class Candidate {
    private int candidateId;
    private String name;
    private int votes;

    public Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
        this.votes = 0;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void addVote() {
        votes++;
    }

    public void displayResult() {
        System.out.println(name + " : " + votes + " votes");
    }
}
