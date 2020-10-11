package juanavila.mastermind;

import java.util.Scanner;

public class Mastermind {

    private static final int MAX_ATTEMPTS = 10;

    private Board board;

    private void newGame() {
        this.board = new Board(MAX_ATTEMPTS);

        Player maker = new RandomMakerPlayer(board);
        Player breaker = new HumanBreakerPlayer(board);

        maker.play();
        this.board.print();

        do {
            breaker.play();
            this.board.print();
        }
        while(!this.isGameOver());

        if(board.isCodeBroken())
            breaker.announceWin();
        else
            maker.announceWin();
    }

    private void start() {
        do {
            this.newGame();
        }
        while(this.isGameResumed());
    }

    private boolean isGameResumed() {
        Message.RESUME.writeln();
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        return response.equalsIgnoreCase("y");
    }

    private boolean isGameOver() {
        return !board.isCodeBroken() && !board.isMaxAttemptsReached();
    }

    public static void main(String[] args) {
        new Mastermind().start();
    }

}
