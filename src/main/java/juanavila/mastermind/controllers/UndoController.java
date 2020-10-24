package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;

public class UndoController extends Controller {

  UndoController(Session session) {
    super(session);
  }

  void undo() {
    this.session.undo();
  }

  boolean isUndoable() {
    return this.session.isUndoable();
  }

}
