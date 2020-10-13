package juanavila.mastermind.views;

import juanavila.mastermind.models.Board;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.SecretCombination;
import juanavila.utils.YesNoDialog;

public class GameView {

    private Board board;
    private BoardView boardView;
    private ProposedCombinationForm proposedCombinationForm;

    public GameView(Board board) {
        this.board = board;
        this.boardView = new BoardView(board);
        this.proposedCombinationForm = new ProposedCombinationForm();
    }

    private boolean isResumedGame() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public void interact() {
        do {
            this.print();
        } while (this.isResumedGame());
    }

    private void print() {
        Message.TITLE.writeln();
        SecretCombination secretCombination = new SecretCombinationForm().read();
        this.board.putSecretCombination(secretCombination);
        boardView.print();

        do {
            ProposedCombination proposedCombination = proposedCombinationForm.read();
            this.board.add(proposedCombination);
            boardView.print();
        } while (!this.board.isFinished());

        Message message = Message.LOOSER;
        if (this.board.isWinner()){
            message = Message.WINNER;
        }
        message.writeln();
    }

}
