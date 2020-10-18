package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.Logic;
import juanavila.utils.YesNoDialog;

class ResumeView {

	private Logic logic;

	ResumeView(Logic logic) {
		this.logic = logic;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.logic.resume();
		}
		return newGame;
	}

}
