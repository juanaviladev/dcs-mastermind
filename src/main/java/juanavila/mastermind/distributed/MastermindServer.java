package juanavila.mastermind.distributed;

import juanavila.mastermind.distributed.dispatchers.DispatcherRegistry;

public class MastermindServer {

	private DispatcherRegistry dispatcherRegistry;

	private LogicServer logic;

	private MastermindServer() {
		this.dispatcherRegistry = new DispatcherRegistry();
		this.logic = new LogicServer();
		this.logic.createDispatchers(this.dispatcherRegistry);
	}

	private void serve() {
		this.dispatcherRegistry.serve();
	}

	public static void main(String[] args) {
		new MastermindServer().serve();
	}

}
