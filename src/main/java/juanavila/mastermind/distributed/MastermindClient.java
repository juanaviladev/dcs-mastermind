package juanavila.mastermind.distributed;

import juanavila.mastermind.MastermindStarter;
import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.console.View;

public class MastermindClient extends MastermindStarter {

    private LogicProxy logicProxy;

    @Override
    protected Logic createLogic() {
        this.logicProxy = new LogicProxy();
        return this.logicProxy;
    }

    @Override
    protected MastermindView createView() {
        return new View();
    }

    @Override
    protected void play() {
        super.play();
        this.logicProxy.close();
    }

    public static void main(String[] args) {
        new MastermindClient().play();
    }

}
