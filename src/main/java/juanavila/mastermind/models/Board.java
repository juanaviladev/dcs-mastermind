package juanavila.mastermind.models;

public class Board {

  private static final int MAX_ATTEMPS = 10;
  private SecretCombination secretCombination;
  private ProposedCombination[] proposedCombinations;
  private Result[] results;
  private int attempts;

  public void putSecretCombination(SecretCombination secretCombination) {
    this.proposedCombinations = new ProposedCombination[Board.MAX_ATTEMPS];
    this.secretCombination = secretCombination;
    this.attempts = 0;
    this.results = new Result[Board.MAX_ATTEMPS];
  }

  public void add(ProposedCombination proposedCombination) {
    this.proposedCombinations[this.attempts] = proposedCombination;
    this.results[this.attempts] = this.secretCombination.getResult(proposedCombination);
    this.attempts++;
  }

  public boolean isFinished() {
    return this.isWinner() || this.isLooser();
  }

  public boolean isWinner() {
    return this.results[this.attempts-1].isWinner();
  }

  private boolean isLooser() {
    return this.attempts == Board.MAX_ATTEMPS;
  }

  public int getAttempts() {
    return attempts;
  }


  public SecretCombination getSecretCombination() {
    return secretCombination;
  }

  public Result getResult(int i) {
    return results[i];
  }

  public ProposedCombination getProposedCombination(int i) {
    return proposedCombinations[i];
  }
}
