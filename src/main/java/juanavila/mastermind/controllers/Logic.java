package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;
import juanavila.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public abstract class Logic {

    protected Session session;
    private Map<StateValue, AcceptorController> controllers;

    public Logic() {
        this.controllers = new HashMap<>();
    }

    protected void addController(StateValue state, AcceptorController controller) {
        this.controllers.put(state,controller);
    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValue());
    }

}
