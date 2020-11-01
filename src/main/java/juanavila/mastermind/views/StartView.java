package juanavila.mastermind.views;

import juanavila.utils.WithConsoleView;

public class StartView extends WithConsoleView {

	public void write() {
		this.console.writeln(MessageView.TITLE.getMessage());
	}

}
