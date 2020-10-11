package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

public class CombinationPickerDialog {

    private static final Color[] NULL_ARRAY = new Color[0];

    ProposedCombination ask() {
        Color[] chosenColors;
        do {
            String colors = Console.instance().readString(Message.COMBINATION_PROPOSAL.toString());
            chosenColors = parseColors(colors);
        }
        while (chosenColors.length != Combination.ACCEPTED_LENGTH);

        return new ProposedCombination(chosenColors);
    }

    private Color[] parseColors(String colors) {
        if(colors.length() != Combination.ACCEPTED_LENGTH) {
            Error.WRONG_PROPOSAL_LENGTH.writeln();
            return NULL_ARRAY;
        }

        Color[] chosenColors = new Color[Combination.ACCEPTED_LENGTH];
        int i = 0;

        Color chosen = Color.from(colors.charAt(i));
        while (i < Combination.ACCEPTED_LENGTH && !chosen.isNull()) {
            chosenColors[i] = chosen;
            chosen = Color.from(colors.charAt(i));
            i++;
        }

        if (chosen.isNull()) {
            chosenColors = NULL_ARRAY;
            Error.WRONG_COLORS.writeln(Color.palette());
        }

        return chosenColors;
    }
}
