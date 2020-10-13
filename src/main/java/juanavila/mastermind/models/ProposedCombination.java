package juanavila.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class ProposedCombination extends Combination {

    public ProposedCombination(ArrayList<Color> colors) {
        super(colors);
    }

	public boolean contains(Color color, int position) {
        return this.colors.get(position) == color;
    }

	public boolean contains(Color color) {
        for (int i = 0; i < this.colors.size(); i++) {
            if (this.colors.get(i) == color) {
                return true;
            }
        }
        return false;
    }

	public List<Color> colors() {
		return new ArrayList<>(colors);
	}

}
