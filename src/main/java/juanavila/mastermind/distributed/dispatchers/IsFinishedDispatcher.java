package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;

public class IsFinishedDispatcher extends Dispatcher {

	private PlayController controller;

	public IsFinishedDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.connection.send(controller.isFinished());
	}

}
