package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

public class StartController extends Controller {
    public StartController(Mastermind game, State state) {
        super(game,state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
