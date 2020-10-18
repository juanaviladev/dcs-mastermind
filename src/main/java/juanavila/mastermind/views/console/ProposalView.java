package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	private ProposalController controller;
	
	private SecretCombinationView secretCombinationView;

	ProposalView(ProposalController controller) {
		this.controller = controller;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.controller.addProposedCombination(proposedCombination);
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.controller.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.controller.getAttempts(); i++) {
			new ProposedCombinationView(this.controller.getProposedCombination(i)).write();
			new ResultView(this.controller.getResult(i)).writeln();
		}
		if (this.controller.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.controller.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
