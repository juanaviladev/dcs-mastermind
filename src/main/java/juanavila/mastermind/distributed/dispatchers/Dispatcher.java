package juanavila.mastermind.distributed.dispatchers;

public abstract class Dispatcher {

    protected RemoteConnection connection;

    protected abstract void dispatch();

    public void associate(RemoteConnection connection) {
        this.connection = connection;
    }
}
