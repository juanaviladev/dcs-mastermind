package juanavila.mastermind;

public abstract class Combination {

    protected final Color[] positions;

    protected Combination(Color[] positions) {
        this.positions = positions;
    }

    abstract void print();
}
