package juanavila.mastermind.distributed.dispatchers;

import java.util.HashMap;
import java.util.Map;

public class DispatcherRegistry {

	private RemoteConnection connection;

	private Map<FrameType, Dispatcher> dispatcherMap;

	public DispatcherRegistry() {
		this.connection = RemoteConnection.connectToClient();
		this.dispatcherMap = new HashMap<FrameType, Dispatcher>();
	}
	
	public void add (FrameType frameType, Dispatcher dispatcher) {
		this.dispatcherMap.put(frameType, dispatcher);
		dispatcher.associate(this.connection);
	}

	public void dispatch(FrameType frameType) {
		Dispatcher d = this.dispatcherMap.get(frameType);
		d.dispatch();
	}

	public void serve() {
		FrameType frameType = null;
		do {
			frameType = this.connection.receiveFrame();
			if (frameType != FrameType.CLOSE) {
				this.dispatch(frameType);
			}
		} while (frameType != FrameType.CLOSE);
		this.connection.close();
	}

}
