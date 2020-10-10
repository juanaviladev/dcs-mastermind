package juanavila.mastermind;

import java.util.Random;

public class RandomMakerPlayer implements Player {

    private Board board;

    public RandomMakerPlayer(Board board) {
        this.board = board;
    }

    public void play() {
        Random random = new Random();

        Color[] availableColors = Color.values();
        Color[] positions = new Color[4];

        for(int i = 0; i < positions.length; i++) {
            int colorIndex = random.nextInt(availableColors.length);
            positions[i] = availableColors[colorIndex];
        }

        SecretCombination combination = new SecretCombination(positions);
        board.putSecretCombination(combination);
    }

    public void announceWin() {
        System.out.println("You've lost!!! :-(");
    }
}
