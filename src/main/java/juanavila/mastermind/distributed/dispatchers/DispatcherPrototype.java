package juanavila.mastermind.distributed.dispatchers;

import java.util.HashMap;
import java.util.Map;

public class DispatcherPrototype {

	private RemoteConnection connection;

	private Map<FrameType, Dispatcher> dispatcherMap;

	public DispatcherPrototype() {
		this.connection = RemoteConnection.connectToClient();
		this.dispatcherMap = new HashMap<>();
	}
	
	public void add (FrameType frameType, Dispatcher dispatcher) {
		this.dispatcherMap.put(frameType, dispatcher);
		dispatcher.associate(this.connection);
	}

	public void serve() {
		FrameType frameType = null;
		do {
			frameType = this.connection.receiveFrame();
			if (frameType != FrameType.CLOSE) {
				Dispatcher d = this.dispatcherMap.get(frameType);
				d.dispatch();
			}
		} while (frameType != FrameType.CLOSE);
		this.connection.close();
	}

}
