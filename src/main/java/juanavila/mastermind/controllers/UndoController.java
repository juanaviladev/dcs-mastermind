package juanavila.mastermind.controllers;

import juanavila.mastermind.models.SessionImplementation;

public class UndoController {

    private SessionImplementation session;

    public UndoController(SessionImplementation session) {
        this.session = session;
    }

    public void undo() {
        this.session.undo();
    }

    public boolean isUndoable() {
        return this.session.isUndoable();
    }

}
