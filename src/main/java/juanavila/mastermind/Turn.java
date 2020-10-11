package juanavila.mastermind;

public class Turn {

    private final RandomMakerPlayer maker;
    private final HumanBreakerPlayer breaker;
    private final Board board;

    private boolean firstPlay;

    public Turn(Board board) {
        this.board = board;
        this.maker = new RandomMakerPlayer(board);
        this.breaker = new HumanBreakerPlayer(board);
        this.firstPlay = true;
    }

    public void play() {
        if(firstPlay) {
            this.maker.play();
            firstPlay = false;
        }
        else {
            this.breaker.play();
        }
    }

    public Player winner() {
        if(board.isCodeBroken())
            return breaker;
        else if(board.isMaxAttemptsReached())
            return maker;
        else
            return null;
    }
}
