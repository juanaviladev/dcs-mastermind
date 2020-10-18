package juanavila.mastermind.controllers;

import juanavila.mastermind.models.StateValue;

public class State {

    private StateValue value;

    public State() {
        this.reset();
    }

    public void reset() {
        this.value = StateValue.START;
    }

    public void next() {
        this.value = StateValue.values()[this.value.ordinal() + 1];
    }

    public StateValue getValue() {
        return this.value;
    }

}
