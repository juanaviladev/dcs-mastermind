package juanavila.mastermind.controllers.implementation;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.models.SessionImplementation;
import juanavila.mastermind.models.StateValue;

public class LogicImplementation extends Logic {

    protected StartControllerImplementation startControllerImplementation;

    protected PlayControllerImplementation playControllerImplementation;

    protected ResumeControllerImplementation resumeControllerImplementation;

    public LogicImplementation() {
        SessionImplementation session = new SessionImplementation();

        this.startControllerImplementation = new StartControllerImplementation(session);
        this.playControllerImplementation = new PlayControllerImplementation(session);
        this.resumeControllerImplementation = new ResumeControllerImplementation(session);

        this.addController(StateValue.START, this.startControllerImplementation);
        this.addController(StateValue.PLAY, this.playControllerImplementation);
        this.addController(StateValue.RESUME, this.resumeControllerImplementation);
        this.addController(StateValue.EXIT, null);
        this.session = session;
    }

}
