package juanavila.mastermind.distributed.dispatchers;

import juanavila.mastermind.models.Color;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;
import juanavila.mastermind.models.StateValue;
import juanavila.utils.TCPIP;

public class RemoteConnection {

    private TCPIP tcpip;

    public RemoteConnection(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    public static RemoteConnection connectToServer() {
        try {
            return new RemoteConnection(TCPIP.createClientSocket());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static RemoteConnection connectToClient() {
        try {
            return new RemoteConnection(TCPIP.createServerSocket());
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void close() {
        this.send(FrameType.CLOSE.name());
        this.tcpip.close();
    }

    public void send(Object value) {
        this.tcpip.send(value.toString());
    }

    public void send(StateValue value) {
        send(value.ordinal());
    }

    public void send(Result result) {
        this.send(result.getBlacks());
        this.send(result.getWhites());
    }

    public void send(ProposedCombination combination) {
        this.send(combination.getColors().size());
        for(Color color : combination.getColors()) {
            this.tcpip.send(color.name());
        }
    }

    public boolean receiveBoolean() {
        return this.tcpip.receiveBoolean();
    }

    public int receiveInt() {
        return this.tcpip.receiveInt();
    }

    public ProposedCombination receiveProposedCombination() {
        int combinationSize = this.tcpip.receiveInt();
        ProposedCombination combination = new ProposedCombination();
        for(int i = 0; i < combinationSize;i++) {
            combination.getColors().add(Color.valueOf(this.tcpip.receiveLine()));
        }
        return combination;
    }

    public Result receiveResult() {
        int whites = this.tcpip.receiveInt();
        int blacks = this.tcpip.receiveInt();
        return new Result(whites, blacks);
    }

    public StateValue receiveState() {
        return StateValue.values()[this.tcpip.receiveInt()];
    }

    public FrameType receiveFrame() {
        return FrameType.parser(this.tcpip.receiveLine());
    }
}
