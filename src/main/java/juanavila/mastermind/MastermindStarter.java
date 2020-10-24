package juanavila.mastermind;

import juanavila.mastermind.controllers.AcceptorController;
import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;

public abstract class MastermindStarter {

    private Logic logic;
    private MastermindView view;

    public MastermindStarter() {
        this.logic = new Logic();
        this.view = createView();
    }

    void start() {
        AcceptorController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }

    abstract MastermindView createView();
}
