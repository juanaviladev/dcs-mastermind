package juanavila.mastermind.distributed;

import juanavila.mastermind.controllers.ControllerVisitor;
import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.distributed.dispatchers.FrameType;
import juanavila.mastermind.distributed.dispatchers.RemoteConnection;

public class ResumeControllerProxy implements ResumeController {

    private RemoteConnection connection;

    public ResumeControllerProxy(RemoteConnection connection) {
        this.connection = connection;
    }

    @Override
    public void resume(boolean newGame) {
        this.connection.send(FrameType.NEW_GAME);
        this.connection.send(newGame);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
