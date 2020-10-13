package juanavila.mastermind;

public abstract class Combination {

    protected final Color[] positions;

    static final int ACCEPTED_LENGTH = 4;

    protected Combination(Color[] positions) {
        if(positions == null || positions.length != ACCEPTED_LENGTH)
            throw new IllegalArgumentException(Error.WRONG_PROPOSAL_LENGTH.toString());

        this.positions = positions;
    }

    abstract void print();
}
