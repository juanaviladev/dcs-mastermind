package juanavila.mastermind.views.graphics;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;

import javax.swing.*;

public class GraphicsView extends MastermindView {

    private Mastermind game;

    public GraphicsView(Mastermind game) {
        this.game = game;
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Swing graphics version is not yet supported");
    }

    @Override
    public boolean isResumed() {
        return false;
    }
}
