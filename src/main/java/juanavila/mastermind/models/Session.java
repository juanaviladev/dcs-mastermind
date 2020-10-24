package juanavila.mastermind.models;

public class Session {

    private State state;
    private Mastermind mastermind;
    private GameRegistry registry;

    public Session() {
        this.state = new State();
        this.mastermind = new Mastermind();
    }

    public void x() {
        this.registry = new GameRegistry(this.mastermind);
    }

    public void redo() {
        this.registry.redo();
    }

    public void undo() {
        this.registry.undo();
    }

    public boolean isUndoable() {
        return this.registry.isUndoable();
    }

    public boolean isRedoable() {
        return this.registry.isRedoable();
    }

    public boolean isFinished() {
        return this.mastermind.isFinished();
    }

    public void reset() {
        this.mastermind.restart();
        this.state.reset();
    }

    public StateValue getValue() {
        return this.state.getValue();
    }
}
