package juanavila.mastermind.console;

import juanavila.mastermind.models.Result;
import juanavila.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
