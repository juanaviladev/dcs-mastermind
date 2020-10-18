package juanavila.mastermind.views;

import juanavila.mastermind.models.SecretCombination;
import juanavila.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

	SecretCombinationView() {
		super();
	}

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
