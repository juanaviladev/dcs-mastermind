package juanavila.mastermind.controllers.implementation;

import juanavila.mastermind.controllers.StartController;
import juanavila.mastermind.models.InMemorySession;

public class StartControllerImplementation extends StartController {

    private InMemorySession session;

    public StartControllerImplementation(InMemorySession session) {
        this.session = session;
    }

    @Override
    public void start() {
        this.session.next();
    }
}
