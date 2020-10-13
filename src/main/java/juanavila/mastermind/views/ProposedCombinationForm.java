package juanavila.mastermind.views;

import juanavila.mastermind.models.Color;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;
import juanavila.utils.Console;

import java.util.ArrayList;

public class ProposedCombinationForm {

    public ProposedCombination read() {
        ArrayList<Color> colors = new ArrayList<>();

        Error error;
        do {
            Message.PROPOSED_COMBINATION.write();
            error = this.checkError(Console.instance().readString(), colors);
            error.writeln();
            if (!error.isNull()) {
                colors = new ArrayList<>();
            }
        } while (!error.isNull());

        return new ProposedCombination(colors);
    }


    private Error checkError(String characters, ArrayList<Color> colors){
        if (characters.length() != Result.WIDTH) {
            return Error.WRONG_LENGTH;
        }
        for (int i = 0; i < characters.length(); i++) {
            Color color = Color.getInstance(characters.charAt(i));
            if (color.isNull()) {
                return Error.WRONG_CHARACTERS;
            }
            for(int j=0; j<i; j++){
                if (colors.get(j) == color) {
                    return Error.DUPLICATED;
                }
            }
            colors.add(color);
        }
        return Error.NULL_ERROR;
    }

}
