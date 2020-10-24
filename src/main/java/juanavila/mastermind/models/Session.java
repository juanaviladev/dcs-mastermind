package juanavila.mastermind.models;

public class Session {

    private State state;
    private Mastermind mastermind;
    private GameRegistry registry;

    public Session() {
        this.state = new State();
        this.mastermind = new Mastermind();
        this.reset();
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
        this.mastermind.reset();
        this.state.reset();
        this.registry = new GameRegistry(this.mastermind);
    }

    public StateValue getValue() {
        return this.state.getValue();
    }

    public boolean isWinner() {
        return this.mastermind.isWinner();
    }

    public boolean isLooser() {
        return this.mastermind.isLooser();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.mastermind.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.mastermind.getResult(position);
    }

    public void next() {
        this.state.next();
    }

    public void addProposedCombination(ProposedCombination combination) {
        this.mastermind.addProposedCombination(combination);
        this.registry.register();
    }

    public int getAttempts() {
        return this.mastermind.getAttempts();
    }
}
