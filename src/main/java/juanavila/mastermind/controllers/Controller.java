package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.models.State;

public abstract class Controller {

    protected Mastermind game;
    private State state;

    Controller(Mastermind game, State state) {
        this.game = game;
        this.state = state;
    }

    protected void next() {
        this.state.next();
    }

    protected void reset() {
        this.state.reset();
    }

    public abstract void control();

}
