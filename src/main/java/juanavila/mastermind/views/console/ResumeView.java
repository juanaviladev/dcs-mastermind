package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.implementation.ResumeControllerImplementation;
import juanavila.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeControllerImplementation controller) {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		controller.resume(newGame);
	}

}
