package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

public class HumanBreakerPlayer implements Player {

    private Board board;

    public HumanBreakerPlayer(Board board) {
        this.board = board;
    }

    public void play() {
        String colors = Console.instance().readString(Message.COMBINATION_PROPOSAL.toString());
        Color[] chosenColors;
        do {
            chosenColors = parseColors(colors);
        }
        while (chosenColors.length != Combination.ACCEPTED_LENGTH);

        ProposedCombination combination = new ProposedCombination(chosenColors);
        board.proposeCombination(combination);
    }

    private Color[] parseColors(String colors) {
        Color[] position = new Color[Combination.ACCEPTED_LENGTH];
        int i = 0;

        Color chosen = Color.from(colors.charAt(i));
        while (i < Combination.ACCEPTED_LENGTH && !chosen.isNull()) {
            position[i] = chosen;
            chosen = Color.from(colors.charAt(i));
            i++;
        }

        if (chosen.isNull()) {
            position = new Color[0];
            Console.instance().writelnError(Error.WRONG_COLORS.toString(),Color.palette());
        }

        return position;
    }

    public void announceWin() {
        Message.BREAKER_WIN.writeln();
    }
}
