package juanavila.mastermind.controllers;

import juanavila.mastermind.models.*;

public class ProposalController {

	private InMemorySession session;

	public ProposalController(InMemorySession session) {
		this.session = session;
	}

	public int getAttempts() {
    	return this.session.getAttempts();
	}

	public void addProposedCombination(ProposedCombination combination) {
		this.session.addProposedCombination(combination);
		if(this.session.isFinished()) {
			session.next();
		}
	}

	public boolean isWinner() {
		return this.session.isWinner();
	}

	public boolean isLooser() {
		return this.session.isLooser();
	}

	public ProposedCombination getProposedCombination(int position) {
		return this.session.getProposedCombination(position);
	}

	public Result getResult(int position) {
		return this.session.getResult(position);
	}

	public boolean isFinished() {
		return this.session.isFinished();
	}
}
