package juanavila.mastermind;

import juanavila.mastermind.controllers.AcceptorController;
import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;

public abstract class MastermindStarter {

    private Logic logic;
    private MastermindView view;

    public MastermindStarter() {
        this.logic = this.createLogic();
        this.view = this.createView();
    }

    protected abstract Logic createLogic();
    protected abstract MastermindView createView();

    protected void start() {
        AcceptorController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }

}
