package juanavila.mastermind.controllers;

import juanavila.mastermind.models.SessionImplementation;

public class RedoController {

  private SessionImplementation session;

  public RedoController(SessionImplementation session) {
    this.session = session;
  }

  public void redo() {
    this.session.redo();
  }

  public boolean isRedoable() {
    return this.session.isRedoable();
  }

}
