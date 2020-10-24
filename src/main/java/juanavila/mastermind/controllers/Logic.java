package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;
import juanavila.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Session session;
    private Map<StateValue, AcceptorController> controllers;

    public Logic() {
        this.session = new Session();
        this.controllers = new HashMap<>();

        this.controllers.put(StateValue.START, new StartController(this.session));
        this.controllers.put(StateValue.PROPOSAL, new PlayController(this.session));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValue());
    }

}
