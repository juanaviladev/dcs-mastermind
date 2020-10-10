package juanavila.mastermind;

public class Mastermind {

    private Player maker;
    private Player breaker;
    private Board board;

    public void start() {
        this.maker = new MakerPlayer();
        this.breaker = new BreakerPlayer();

        this.maker.play();
        do {
            this.breaker.play();
        }
        while(this.isGameInProgress());

        if(board.isSecretBroken()) {
            breaker.announceWin();
        }
        else {
            maker.announceWin();
        }

    }

    private boolean isGameInProgress() {
        return !board.isSecretGuessed() && !board.isMaxAttemptsReached();
    }

    public static void main(String[] args) {
        new Mastermind().start();
    }

}
