package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;

public class UndoController implements Controller {

    private InMemorySession session;

    UndoController(InMemorySession session) {
        this.session = session;
    }

    void undo() {
        this.session.undo();
    }

    boolean isUndoable() {
        return this.session.isUndoable();
    }

}
