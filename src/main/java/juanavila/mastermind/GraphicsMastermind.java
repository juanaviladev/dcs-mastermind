package juanavila.mastermind;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind {

    private MastermindView view;

    public GraphicsMastermind() {
        Mastermind mastermind = new Mastermind();
        this.view = new GraphicsView(mastermind);
    }

    void start() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().start();
    }
}
