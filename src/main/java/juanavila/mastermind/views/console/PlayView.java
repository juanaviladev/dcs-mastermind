package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;
import juanavila.utils.WithConsoleView;

class PlayView extends WithConsoleView {

	void interact(PlayController controller) {
		new BoardView(controller).write();
		MessageView.SEPARATOR.writeln();
		new PlayMenu(controller).execute();
	}

}
