package juanavila.mastermind.views;

import juanavila.utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

	public void writeAttempts(int attempts) {
		this.console.writeln(MessageView.ATTEMPTS.getMessage(attempts));
	}

	public void writeWinner() {
		this.console.writeln(MessageView.WINNER.getMessage());
	}

	public void writeLooser() {
		this.console.writeln(MessageView.LOOSER.getMessage());
	}

	public void writeTitle() {
		this.console.writeln(MessageView.PROPOSED_COMBINATION.getMessage());
	}

	public String readProposal() {
		return this.console.readString();
	}

	public void writeLineBreak() {
		this.console.writeln();
	}
}
