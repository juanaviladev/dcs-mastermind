package juanavila.mastermind.views.graphics;

import juanavila.mastermind.views.MastermindView;

public class GraphicsView extends MastermindView {

    @Override
    public void play() {
        throw new UnsupportedOperationException("Swing graphics version is not yet supported");
    }

    @Override
    public boolean isResumed() {
        return false;
    }
}
