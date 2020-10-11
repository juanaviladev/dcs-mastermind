package juanavila.mastermind;

public class RandomMakerPlayer implements Player {

    private Board board;

    public RandomMakerPlayer(Board board) {
        this.board = board;
    }

    public void play() {
        Color[] positions = new Color[Combination.ACCEPTED_LENGTH];

        for(int i = 0; i < positions.length; i++) {
            positions[i] = Color.random();
        }

        board.putSecretCombination(new SecretCombination(positions));
    }

    public void announceWin() {
        Message.MAKER_WIN.writeln();
    }
}
