package juanavila.mastermind.views;

import juanavila.utils.WithConsoleView;
import juanavila.utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

	public boolean read() {
		this.console.write(MessageView.RESUME.getMessage());
		return new YesNoDialog().read();
	}

}
