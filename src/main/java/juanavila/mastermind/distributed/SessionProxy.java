package juanavila.mastermind.distributed;

import juanavila.mastermind.distributed.dispatchers.FrameType;
import juanavila.mastermind.distributed.dispatchers.RemoteConnection;
import juanavila.mastermind.models.Session;
import juanavila.mastermind.models.StateValue;

public class SessionProxy implements Session {
	
	private RemoteConnection connection;

	public SessionProxy(RemoteConnection connection) {
		this.connection = connection;
	}

	@Override
	public StateValue getValue() {
		this.connection.send(FrameType.STATE);
		return this.connection.receiveState();
	}
}
