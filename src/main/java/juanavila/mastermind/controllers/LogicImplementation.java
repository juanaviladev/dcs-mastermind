package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;
import juanavila.mastermind.models.StateValue;

public class LogicImplementation extends Logic {

    public LogicImplementation() {
        InMemorySession session = new InMemorySession();
        this.addController(StateValue.START, new StartControllerImplementation(session));
        this.addController(StateValue.PROPOSAL, new PlayControllerImplementation(session));
        this.addController(StateValue.RESUME, new ResumeControllerImplementation(session));
        this.addController(StateValue.EXIT, null);
        this.session = session;
    }

}
