package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

abstract class Controller {
    
    protected Mastermind game;

	Controller(Mastermind game) {
		this.game = game;
  }

}
