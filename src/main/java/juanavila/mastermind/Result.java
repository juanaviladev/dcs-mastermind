package juanavila.mastermind;

public class Result {

    private static final int BLACKS_WINNING_AMOUNT = 4;

    private int blacks;
    private int whites;

    private SecretCombination secret;
    private ProposedCombination proposed;

    public Result(int blacks, int whites, SecretCombination secret, ProposedCombination proposed) {
        this.blacks = blacks;
        this.whites = whites;
        this.secret = secret;
        this.proposed = proposed;
    }

    boolean isWinner() {
        return blacks == BLACKS_WINNING_AMOUNT;
    }

    public void print() {
        proposed.print();
        Message.RESULT.writeln(blacks, whites);
    }
}
