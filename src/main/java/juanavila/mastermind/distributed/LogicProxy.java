package juanavila.mastermind.distributed;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.distributed.dispatchers.RemoteConnection;
import juanavila.mastermind.models.StateValue;

public class LogicProxy extends Logic {

    private RemoteConnection connection;

    public LogicProxy() {
        this.connection = RemoteConnection.connectToServer();
        this.addController(StateValue.START, new StartControllerProxy(this.connection));
        this.addController(StateValue.PLAY, new PlayControllerProxy(this.connection));
        this.addController(StateValue.RESUME, new ResumeControllerProxy(this.connection));
        this.addController(StateValue.EXIT, null);

        this.session = new SessionProxy(this.connection);
    }

    public void close() {
        this.connection.close();
    }

}
