package juanavila.mastermind.views;

import juanavila.mastermind.models.Color;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.utils.Console;

public class ProposedCombinationView {

    private ProposedCombination combination;

    public ProposedCombinationView(ProposedCombination combination) {
        this.combination = combination;
    }

    public void print() {
        for(Color color : combination.colors())
            new ColorView(color).print();
    }

}
