package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;

public class RedoCommand extends Command {
    public RedoCommand(PlayController playController) {
        super(MessageView.REDO_COMMAND.getTitle(), playController);
    }

    @Override
    public boolean isActive() {
        return this.playController.isRedoable();
    }

    @Override
    public void execute() {
        this.playController.redo();
    }
}
