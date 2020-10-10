package juanavila.mastermind;

public class Board {

    private final int MAX_ATTEMPTS;
    private int currentAttempts;
    private SecretCombination secretCombination;

    private Result[] results;

    public Board(int maxAttempts) {
        this.MAX_ATTEMPTS = maxAttempts;
        this.currentAttempts = 0;
        this.results = new Result[maxAttempts];
    }

    public void putSecretCombination(SecretCombination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public void proposeCombination(ProposedCombination combination) {
        Result result = this.secretCombination.compareWith(combination);
        this.results[this.currentAttempts] = result;
        currentAttempts++;
    }

    public boolean isSecretGuessed() {
        Result lastResult = this.results[this.currentAttempts - 1];
        return lastResult.isWinner();
    }

    public boolean isMaxAttemptsReached() {
        return currentAttempts == MAX_ATTEMPTS;
    }

    public void print() {
        System.out.println(currentAttempts + " attempt(s):");
        secretCombination.print();
        System.out.println();
        for (int i = 0; i < currentAttempts; i++) {
            Result result = results[i];
            result.print();
        }
    }
}
