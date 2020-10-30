package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;

public class ProposalDispatcher extends Dispatcher {

	private PlayController controller;

	public ProposalDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		controller.addProposedCombination(this.connection.receiveProposedCombination());
	}

}
