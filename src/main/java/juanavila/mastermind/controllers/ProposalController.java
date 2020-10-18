package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;

class ProposalController extends Controller {

	public ProposalController(Mastermind game) {
		super(game);
	}

	public int getAttempts() {
    	return this.game.getAttempts();
	}

	public void addProposedCombination(ProposedCombination combination) {
		this.game.addProposedCombination(combination);
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public ProposedCombination getProposedCombination(int position) {
		return this.game.getProposedCombination(position);
	}

	public Result getResult(int position) {
		return this.game.getResult(position);
	}

}
