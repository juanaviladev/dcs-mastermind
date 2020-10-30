package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.ResumeController;

public class ResumeDispatcher extends Dispatcher {

	private ResumeController controller;

	public ResumeDispatcher(ResumeController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		boolean newGame = this.connection.receiveBoolean();
		controller.resume(newGame);
	}

}
