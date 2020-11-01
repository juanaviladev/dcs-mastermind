package juanavila.mastermind.distributed;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.distributed.dispatchers.FrameType;
import juanavila.mastermind.distributed.dispatchers.RemoteConnection;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;

public class PlayControllerProxy extends PlayController {

    private RemoteConnection connection;

    public PlayControllerProxy(RemoteConnection connection) {
        this.connection = connection;
    }

    @Override
    public void undo() {
        this.connection.send(FrameType.UNDO);
    }

    @Override
    public boolean isUndoable() {
        this.connection.send(FrameType.UNDOABLE);
        return this.connection.receiveBoolean();
    }

    @Override
    public void redo() {
        this.connection.send(FrameType.REDO);
    }

    @Override
    public boolean isRedoable() {
        this.connection.send(FrameType.REDOABLE);
        return this.connection.receiveBoolean();
    }

    @Override
    public boolean isFinished() {
        this.connection.send(FrameType.IS_FINISHED);
        return this.connection.receiveBoolean();
    }

    @Override
    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.connection.send(FrameType.PROPOSAL);
        this.connection.send(proposedCombination);
    }

    @Override
    public int getAttempts() {
        this.connection.send(FrameType.ATTEMPTS);
        return this.connection.receiveInt();
    }

    @Override
    public ProposedCombination getProposedCombination(int pos) {
        this.connection.send(FrameType.GET_PROPOSED_COMBINATION);
        this.connection.send(pos);
        return this.connection.receiveProposedCombination();
    }

    @Override
    public Result getResult(int pos) {
        this.connection.send(FrameType.GET_RESULT);
        this.connection.send(pos);
        return this.connection.receiveResult();
    }

    @Override
    public boolean isWinner() {
        this.connection.send(FrameType.IS_WINNER);
        return this.connection.receiveBoolean();
    }

    @Override
    public boolean isLooser() {
        this.connection.send(FrameType.IS_LOOSER);
        return this.connection.receiveBoolean();
    }
}
