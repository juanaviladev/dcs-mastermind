package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.StartController;

public class StartDispatcher extends Dispatcher {

	private StartController controller;

	public StartDispatcher(StartController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.controller.start();
	}

}
