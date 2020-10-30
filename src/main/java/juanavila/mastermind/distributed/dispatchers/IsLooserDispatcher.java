package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;

public class IsLooserDispatcher extends Dispatcher {

	private PlayController controller;

	public IsLooserDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.connection.send(controller.isLooser());
	}

}
