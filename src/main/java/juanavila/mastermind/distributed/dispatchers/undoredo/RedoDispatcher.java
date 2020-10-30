package juanavila.mastermind.distributed.dispatchers.undoredo;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

	private PlayController controller;

	public RedoDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.controller.redo();
	}

}
