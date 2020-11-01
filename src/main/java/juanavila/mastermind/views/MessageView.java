package juanavila.mastermind.views;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-(");

	private String message;
	
	MessageView(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getMessage(int blacks, int whites) {
		return this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites);
	}

	public String getMessage(int attempts) {
		return this.message.replaceAll("#attempts", "" + attempts);
	}
}
