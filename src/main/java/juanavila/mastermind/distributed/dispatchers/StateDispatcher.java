package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.models.Session;

public class StateDispatcher extends Dispatcher {

	private Session session;

	public StateDispatcher(Session session) {
		this.session = session;
	}

	@Override
	public void dispatch() {
		this.connection.send(this.session.getValue());
	}

}
