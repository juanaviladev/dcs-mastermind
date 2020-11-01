package juanavila.mastermind.views;

import juanavila.utils.WithConsoleView;

public class ResultView extends WithConsoleView {
	
	public void writeln(int blacks, int whites) {
		this.console.write(MessageView.RESULT.getMessage(blacks, whites));
	}

}
