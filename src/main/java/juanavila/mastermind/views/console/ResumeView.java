package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.ResumeController;
import juanavila.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController controller) {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		controller.resume(newGame);
	}

}
