package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;
import juanavila.utils.Menu;

public class PlayMenu extends Menu {

    public PlayMenu(PlayController playController) {
        this.addCommand(new ProposalCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }
}
