package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.models.Result;

public class GetResultDispatcher extends Dispatcher {

	private PlayController controller;

	public GetResultDispatcher(PlayController controller) {
		this.controller = controller;
	}

	@Override
	public void dispatch() {
		Result result = controller.getResult(this.connection.receiveInt());
		this.connection.send(result);
	}

}
