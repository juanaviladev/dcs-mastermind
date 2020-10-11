package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

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

    public boolean isCodeBroken() {
        Result lastResult = this.results[this.currentAttempts - 1];
        return lastResult.isWinner();
    }

    public boolean isMaxAttemptsReached() {
        return currentAttempts == MAX_ATTEMPTS;
    }

    public void print() {
        Message.ATTEMPTS.writeln(currentAttempts);
        secretCombination.print();
        Console.instance().newLine();
        for (int i = 0; i < currentAttempts; i++) {
            results[i].print();
        }
    }
}
