package juanavila.mastermind;

import juanavila.mastermind.utils.YesNoDialog;

public class Mastermind {

    private static final int MAX_ATTEMPTS = 10;

    private Board board;

    private void newGame() {
        this.board = new Board(MAX_ATTEMPTS);
        Turn turn = new Turn(this.board);

        do {
            turn.play();
            this.board.print();
        }
        while(!this.isGameOver());

        turn.winner().announceWin();
    }

    private void start() {
        do {
            this.newGame();
        }
        while(this.isGameResumed());
    }

    private boolean isGameResumed() {
        return new YesNoDialog().ask(Message.RESUME.toString());
    }

    private boolean isGameOver() {
        return board.isCodeBroken() || board.isMaxAttemptsReached();
    }

    public static void main(String[] args) {
        new Mastermind().start();
    }

}
