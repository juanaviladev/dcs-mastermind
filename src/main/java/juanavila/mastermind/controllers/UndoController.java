package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;

public class UndoController {

    private InMemorySession session;

    public UndoController(InMemorySession session) {
        this.session = session;
    }

    public void undo() {
        this.session.undo();
    }

    public boolean isUndoable() {
        return this.session.isUndoable();
    }

}
