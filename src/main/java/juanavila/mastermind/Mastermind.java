package juanavila.mastermind;

public class Mastermind {

    private static final int MAX_ATTEMPTS = 10;

    private Player maker;
    private Player breaker;
    private Board board;

    public void start() {
        this.board = new Board(MAX_ATTEMPTS);

        this.maker = new RandomMakerPlayer(board);
        this.breaker = new HumanBreakerPlayer(board);

        this.maker.play();
        do {
            this.board.print();
            this.breaker.play();
        }
        while(this.isGameInProgress());

        if(board.isSecretGuessed())
            breaker.announceWin();
        else
            maker.announceWin();
    }

    private boolean isGameInProgress() {
        return !board.isSecretGuessed() && !board.isMaxAttemptsReached();
    }

    public static void main(String[] args) {
        new Mastermind().start();
    }

}
