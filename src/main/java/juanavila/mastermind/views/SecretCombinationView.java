package juanavila.mastermind.views;

import juanavila.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

	public void writeln(int width) {
		for (int i = 0; i < width; i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}

}
