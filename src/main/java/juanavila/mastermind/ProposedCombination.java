package juanavila.mastermind;

public class ProposedCombination extends Combination {

    protected ProposedCombination(Color[] positions) {
        super(positions);
    }

    void print() {
        for (Color position : positions) {
            position.print();
        }
    }
}
