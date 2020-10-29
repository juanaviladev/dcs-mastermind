package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;

public class StartControllerImplementation implements StartController {

    private InMemorySession session;

    public StartControllerImplementation(InMemorySession session) {
        this.session = session;
    }

    @Override
    public void start() {
        this.session.next();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
