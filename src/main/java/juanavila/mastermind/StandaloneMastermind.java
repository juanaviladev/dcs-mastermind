package juanavila.mastermind;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.controllers.implementation.LogicImplementation;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.console.View;

public class StandaloneMastermind extends MastermindStarter {

    @Override
    protected Logic createLogic() {
        return new LogicImplementation();
    }

    @Override
    protected MastermindView createView() {
        return new View();
    }

    public static void main(String[] args) {
        new StandaloneMastermind().start();
    }
}
