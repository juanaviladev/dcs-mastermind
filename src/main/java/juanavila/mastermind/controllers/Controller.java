package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

public abstract class Controller {
    
    protected Mastermind game;

	Controller(Mastermind game) {
		this.game = game;
  }

}
