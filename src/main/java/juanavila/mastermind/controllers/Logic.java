package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.models.State;
import juanavila.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Map<StateValue, Controller> controllers;
    private Mastermind game;
    private State state;

    public Logic() {
        this.game = new Mastermind();
        this.controllers = new HashMap<>();
        this.state = new State();

        this.controllers.put(StateValue.START, new StartController(this.game, this.state));
        this.controllers.put(StateValue.PROPOSAL, new ProposalController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValue());
    }

}
