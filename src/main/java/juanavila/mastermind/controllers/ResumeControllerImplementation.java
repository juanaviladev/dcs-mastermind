package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;

public class ResumeControllerImplementation implements ResumeController {

    private InMemorySession session;

    public ResumeControllerImplementation(InMemorySession session) {
       this.session = session;
    }

    public void resume(boolean newGame) {
        if (newGame) {
            session.reset();
        } else {
            session.next();
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}