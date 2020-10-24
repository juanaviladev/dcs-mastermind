package juanavila.mastermind.controllers;

import juanavila.mastermind.models.*;

public class ProposalController extends Controller implements AcceptorController {

	public ProposalController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public int getAttempts() {
    	return this.session.getAttempts();
	}

	public void addProposedCombination(ProposedCombination combination) {
		this.session.addProposedCombination(combination);
		if(this.session.isFinished()) {
			next();
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

}
