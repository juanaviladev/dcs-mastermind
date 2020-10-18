package juanavila.mastermind;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends MastermindStarter {

    @Override
    MastermindView createView(Logic logic) {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().start();
    }
}
