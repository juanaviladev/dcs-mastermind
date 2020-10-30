package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;

public class IsWinnerDispatcher extends Dispatcher {

	private PlayController controller;

	public IsWinnerDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.connection.send(controller.isWinner());
	}

}
