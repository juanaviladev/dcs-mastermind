package juanavila.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameMemento {

    private List<ProposedCombination> proposedCombinations;

    private List<Result> results;

    private int attempts;

    GameMemento(List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
        this.proposedCombinations = new ArrayList<>(proposedCombinations);
        this.results = new ArrayList<>(results);
        this.attempts = attempts;
    }

    public List<ProposedCombination> getProposedCombinations() {
        return proposedCombinations;
    }

    public List<Result> getResults() {
        return results;
    }

    public int getAttempts() {
        return attempts;
    }
}