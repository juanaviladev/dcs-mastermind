package juanavila.mastermind.controllers;

import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;

public abstract class PlayController implements AcceptorController {

    public abstract void undo();

    public abstract boolean isUndoable();

    public abstract void redo();

    public abstract boolean isRedoable();

    public abstract boolean isFinished();

    public abstract void addProposedCombination(ProposedCombination proposedCombination);

    public abstract int getAttempts();

    public abstract ProposedCombination getProposedCombination(int pos);

    public abstract Result getResult(int pos);

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
