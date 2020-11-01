package juanavila.mastermind.distributed;

import juanavila.mastermind.controllers.implementation.LogicImplementation;
import juanavila.mastermind.distributed.dispatchers.*;
import juanavila.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import juanavila.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import juanavila.mastermind.distributed.dispatchers.undoredo.UndoDispatcher;
import juanavila.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;

public class LogicServer extends LogicImplementation {

    public void createDispatchers(DispatcherPrototype registry) {
        registry.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        registry.add(FrameType.STATE, new StateDispatcher(this.session));
        registry.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
        registry.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
        registry.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
        registry.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
        registry.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
        registry.add(FrameType.IS_FINISHED, new IsFinishedDispatcher(this.playControllerImplementation));
        registry.add(FrameType.PROPOSAL, new ProposalDispatcher(this.playControllerImplementation));
        registry.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.playControllerImplementation));
        registry.add(FrameType.GET_PROPOSED_COMBINATION, new GetProposedCombinationDispatcher(this.playControllerImplementation));
        registry.add(FrameType.GET_RESULT, new GetResultDispatcher(this.playControllerImplementation));
        registry.add(FrameType.IS_WINNER, new IsWinnerDispatcher(this.playControllerImplementation));
        registry.add(FrameType.IS_LOOSER, new IsLooserDispatcher(this.playControllerImplementation));
    }

}
