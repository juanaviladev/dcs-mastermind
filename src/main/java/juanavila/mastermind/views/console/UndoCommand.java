package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;

public class UndoCommand extends Command {

    public UndoCommand(PlayController playController) {
        super(MessageView.UNDO_COMMAND.getTitle(), playController);
    }

    @Override
    public boolean isActive() {
        return this.playController.isUndoable();
    }

    @Override
    public void execute() {
        this.playController.undo();
    }
}
