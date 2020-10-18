package juanavila.mastermind;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;

public abstract class MastermindStarter {

    private MastermindView view;

    public MastermindStarter() {
        Logic logic = new Logic();

        this.view = createView(logic);
    }

    void start() {
        view.interact();
    }

    abstract MastermindView createView(Logic logic);
}
