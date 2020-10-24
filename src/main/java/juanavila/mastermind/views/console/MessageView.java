package juanavila.mastermind.views.console;

import juanavila.utils.Console;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSAL_COMMAND("Propose a combination"),
	PROPOSE_COMBINATION("Enter combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-("),
	SEPARATOR("\n"),
	UNDO_COMMAND("Undo previous action"),
	REDO_COMMAND("Redo previous action");

	private String message;
	
	private Console console = Console.instance();
	
	private MessageView(String message) {
		this.message = message;
	}

	void write() {
		this.console.write(this.message);
	}

	void writeln() {
		this.console.writeln(this.message);
	}

	void writeln(int attempts) {
		this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
	}

	void writeln(int blacks, int whites) {
		this.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}

	public String getTitle() {
		return this.message;
	}
}
