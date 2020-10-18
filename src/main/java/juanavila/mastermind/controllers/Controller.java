package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

public abstract class Controller {
    
    protected Mastermind game;
    private State state;

	Controller(Mastermind game, State state) {
		this.game = game;
		this.state = state;
  }

    public void next() {
        this.state.next();
    }
    public void reset() {
        this.state.reset();
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

}
