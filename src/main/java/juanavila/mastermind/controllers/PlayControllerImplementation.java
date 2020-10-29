package juanavila.mastermind.controllers;

import juanavila.mastermind.models.InMemorySession;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;

public class PlayControllerImplementation implements PlayController {

    private ProposalController proposalController;
    private UndoController undoController;
    private RedoController redoController;

    public PlayControllerImplementation(InMemorySession session) {
        this.proposalController = new ProposalController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean isUndoable() {
        return this.undoController.isUndoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean isRedoable() {
        return this.redoController.isRedoable();
    }

    public boolean isFinished() {
        return this.proposalController.isFinished();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposalController.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int pos) {
        return this.proposalController.getProposedCombination(pos);
    }

    public Result getResult(int pos) {
        return this.proposalController.getResult(pos);
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }
}
