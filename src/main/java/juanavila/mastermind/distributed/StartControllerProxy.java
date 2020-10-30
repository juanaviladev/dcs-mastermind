package juanavila.mastermind.distributed;

import juanavila.mastermind.controllers.ControllerVisitor;
import juanavila.mastermind.controllers.StartController;
import juanavila.mastermind.distributed.dispatchers.FrameType;
import juanavila.mastermind.distributed.dispatchers.RemoteConnection;

public class StartControllerProxy implements StartController {

    private RemoteConnection connection;

    public StartControllerProxy(RemoteConnection connection) {
        this.connection = connection;
    }

    @Override
    public void start() {
        this.connection.send(FrameType.START);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
