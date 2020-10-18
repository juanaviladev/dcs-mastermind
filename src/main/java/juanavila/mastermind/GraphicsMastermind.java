package juanavila.mastermind;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends MastermindStarter {

    @Override
    MastermindView createView(Mastermind mastermind) {
        return new GraphicsView(mastermind);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().start();
    }
}
