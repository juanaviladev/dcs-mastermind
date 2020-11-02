package juanavila.mastermind.controllers.implementation;

import juanavila.mastermind.controllers.StartController;
import juanavila.mastermind.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

    private SessionImplementation session;

    public StartControllerImplementation(SessionImplementation session) {
        this.session = session;
    }

    @Override
    public void start() {
        this.session.next();
    }
}
