package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

public class HumanBreakerPlayer implements Player {

    private Board board;

    public HumanBreakerPlayer(Board board) {
        this.board = board;
    }

    public void play() {
        Message.COMBINATION_PROPOSAL.writeln();
        String line = Console.instance().readString();
        Color[] position = new Color[4];
        for(int i = 0; i < position.length;i++) {
            position[i] = Color.from(line.charAt(i));
        }

        ProposedCombination combination = new ProposedCombination(position);
        board.proposeCombination(combination);
    }

    public void announceWin() {
        Message.BREAKER_WIN.writeln();
    }
}
