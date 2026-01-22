package Insurance_Policy_Management;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> votes = new HashMap<>();
    private LinkedHashMap<String, Integer> linkedVotes = new LinkedHashMap<>();
    private TreeMap<String, Integer> treeVotes = new TreeMap<>();

    public void vote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate,0)+1);
        linkedVotes.put(candidate, linkedVotes.getOrDefault(candidate,0)+1);
        treeVotes.put(candidate, treeVotes.getOrDefault(candidate,0)+1);
    }

    public void displayResults() {
        System.out.println("HashMap results: " + votes);
        System.out.println("LinkedHashMap results: " + linkedVotes);
        System.out.println("TreeMap results: " + treeVotes);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.vote("Alice");
        vs.vote("Bob");
        vs.vote("Alice");
        vs.displayResults();
    }
}

