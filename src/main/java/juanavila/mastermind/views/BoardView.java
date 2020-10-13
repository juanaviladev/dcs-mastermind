package juanavila.mastermind.views;

import juanavila.mastermind.models.Board;
import juanavila.utils.Console;

public class BoardView {

    private Board board;

    public BoardView(Board board) {
        this.board = board;
    }

    public void print() {
        Console.instance().writeln();

        int attempts = board.getAttempts();
        Message.ATTEMPTS.writeln(attempts);
        new SecretCombinationView(board.getSecretCombination()).print();

        for (int i = 0; i < attempts; i++) {
            new ProposedCombinationView(board.getProposedCombination(i)).print();
            new ResultView(board.getResult(i)).print();
        }
    }

}
