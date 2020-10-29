package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;

public class RedoController {

  private InMemorySession session;

  public RedoController(InMemorySession session) {
    this.session = session;
  }

  public void redo() {
    this.session.redo();
  }

  public boolean isRedoable() {
    return this.session.isRedoable();
  }

}
