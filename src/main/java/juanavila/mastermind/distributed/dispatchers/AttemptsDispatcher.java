package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;

public class AttemptsDispatcher extends Dispatcher {

	private PlayController controller;

	public AttemptsDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.connection.send(controller.getAttempts());
	}

}
