package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.ResumeController;
import juanavila.utils.YesNoDialog;

class ResumeView {

	private ResumeController controller;

	ResumeView(ResumeController controller) {
		this.controller = controller;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.controller.resume();
		}
		return newGame;
	}

}
