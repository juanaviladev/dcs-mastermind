package juanavila.mastermind.distributed.dispatchers.undoredo;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

	private PlayController controller;

	public UndoDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		this.controller.undo();
	}

}
