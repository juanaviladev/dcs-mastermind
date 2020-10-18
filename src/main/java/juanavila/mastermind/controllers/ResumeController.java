package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;

public class ResumeController extends Controller {

  public ResumeController(Mastermind game) {
    super(game);
  }

  public void resume() {
    this.game.clear();
  }

}
