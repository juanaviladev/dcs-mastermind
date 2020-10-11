package juanavila.mastermind;

public class SecretCombination extends Combination {

    public SecretCombination(Color[] positions) {
        super(positions);
    }

    Result compareWith(ProposedCombination other) {
        int blacks = countBlacks(other);
        int whites = countBlackAndWhites(other) - blacks;

        return new Result(blacks, whites, this, other);
    }

    private int countBlacks(ProposedCombination other) {
        int blacks = 0;

        for(int i = 0; i < positions.length; i++) {
            if(this.positions[i] == other.positions[i])
                blacks++;
        }

        return blacks;
    }

    private int countBlackAndWhites(ProposedCombination other) {
        int blacksAndWhites = 0;

        for (Color position : positions) {
            for (int j = 0; j < positions.length; j++) {
                if (position == other.positions[j])
                    blacksAndWhites++;
            }
        }

        return blacksAndWhites;
    }

    void print() {
        for(int i = 0; i < positions.length; i++) {
            Message.SECRET_POSITION.write();
        }
    }

}
