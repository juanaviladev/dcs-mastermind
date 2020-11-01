package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.models.SecretCombination;
import juanavila.mastermind.models.State;
import juanavila.mastermind.views.SecretCombinationView;
import juanavila.mastermind.views.StartView;

public class StartController extends Controller {

    public StartController(Mastermind game, State state) {
        super(game,state);
    }

    @Override
    public void control() {
        new StartView().write();
        new SecretCombinationView().writeln(SecretCombination.getWidth());
        this.next();
    }
}
