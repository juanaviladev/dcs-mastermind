package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

public class ResumeController extends Controller {

    public ResumeController(Mastermind game, State state) {
        super(game, state);
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
