package juanavila.mastermind;

public class HumanBreakerPlayer implements Player {

    private Board board;

    public HumanBreakerPlayer(Board board) {
        this.board = board;
    }

    public void play() {
        ProposedCombination chosenCombination = new CombinationPickerDialog().ask();
        board.proposeCombination(chosenCombination);
    }

    public void announceWin() {
        Message.BREAKER_WIN.writeln();
    }
}
