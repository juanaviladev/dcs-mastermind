package juanavila.mastermind;

import java.util.Scanner;

public class Mastermind {

    private static final int MAX_ATTEMPTS = 10;

    private Player maker;
    private Player breaker;
    private Board board;

    private void newGame() {
        this.board = new Board(MAX_ATTEMPTS);

        this.maker = new RandomMakerPlayer(board);
        this.breaker = new HumanBreakerPlayer(board);

        this.maker.play();
        this.board.print();

        do {
            this.breaker.play();
            this.board.print();
        }
        while(this.isGameInProgress());

        if(board.isSecretGuessed())
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
        System.out.print("RESUME? (y/n): ");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        return response.equalsIgnoreCase("y");
    }

    private boolean isGameInProgress() {
        return !board.isSecretGuessed() && !board.isMaxAttemptsReached();
    }

    public static void main(String[] args) {
        new Mastermind().start();
    }

}
