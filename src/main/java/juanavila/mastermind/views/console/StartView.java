package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.StartController;
import juanavila.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact(StartController startController) {
		MessageView.TITLE.writeln();
		startController.next();
	}

}
