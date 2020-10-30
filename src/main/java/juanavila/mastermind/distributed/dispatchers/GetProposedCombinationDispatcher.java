package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.models.ProposedCombination;

public class GetProposedCombinationDispatcher extends Dispatcher {

	private PlayController controller;

	public GetProposedCombinationDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		ProposedCombination combination = controller.getProposedCombination(this.connection.receiveInt());
		this.connection.send(combination);
	}

}
