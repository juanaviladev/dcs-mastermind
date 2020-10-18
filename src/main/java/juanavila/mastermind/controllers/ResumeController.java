package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

public class ResumeController extends Controller {

    public ResumeController(Mastermind game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.game.clear();
            reset();
        } else {
            next();
        }
    }

}
