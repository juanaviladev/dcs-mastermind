package juanavila.mastermind.distributed.dispatchers.undoredo;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.distributed.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {

	private PlayController controller;

	public UndoableDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.connection.send(controller.isUndoable());
	}

}
