package juanavila.mastermind.controllers;

import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;

public interface PlayController extends AcceptorController {

    void undo();

    boolean isUndoable();

    void redo();

    boolean isRedoable();

    boolean isFinished();

    void addProposedCombination(ProposedCombination proposedCombination);

    int getAttempts();

    ProposedCombination getProposedCombination(int pos);

    Result getResult(int pos);

    boolean isWinner();

    boolean isLooser();

}
