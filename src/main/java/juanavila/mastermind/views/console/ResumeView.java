package juanavila.mastermind.views.console;

import juanavila.mastermind.models.Mastermind;
import juanavila.utils.YesNoDialog;

class ResumeView {

	private Mastermind game;

	ResumeView(Mastermind game) {
		this.game = game;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}
