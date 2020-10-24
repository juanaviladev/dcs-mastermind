package juanavila.mastermind;

import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.graphics.View;

public class GraphicsMastermind extends MastermindStarter {

    @Override
    MastermindView createView() {
        return new View();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().start();
    }
}
