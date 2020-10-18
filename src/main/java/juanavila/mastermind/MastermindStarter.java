package juanavila.mastermind;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;

public abstract class MastermindStarter {

    private MastermindView view;

    public MastermindStarter() {
        Mastermind game = new Mastermind();
        this.view = createView(game);
    }

    void start() {
        view.interact();
    }

    abstract MastermindView createView(Mastermind mastermind);

}
