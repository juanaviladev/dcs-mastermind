package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;

public class RedoController implements Controller {

  private InMemorySession session;

  RedoController(InMemorySession session) {
    this.session = session;
  }

  void redo() {
    this.session.redo();
  }

  boolean isRedoable() {
    return this.session.isRedoable();
  }

}
