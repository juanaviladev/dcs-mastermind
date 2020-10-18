package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	private SecretCombinationView secretCombinationView;

	ProposalView() {
		this.secretCombinationView = new SecretCombinationView();
	}

	void interact(ProposalController controller) {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		controller.addProposedCombination(proposedCombination);
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(controller.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < controller.getAttempts(); i++) {
			new ProposedCombinationView(controller.getProposedCombination(i)).write();
			new ResultView(controller.getResult(i)).writeln();
		}
		if (controller.isWinner()) {
			MessageView.WINNER.writeln();
		} else if (controller.isLooser()) {
			MessageView.LOOSER.writeln();
		}
	}

}
