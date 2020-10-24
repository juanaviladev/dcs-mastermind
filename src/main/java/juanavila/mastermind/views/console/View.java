package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.*;
import juanavila.mastermind.views.MastermindView;

public class View extends MastermindView implements ControllerVisitor {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(AcceptorController controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController controller) {
        this.startView.interact(controller);
    }

    @Override
    public void visit(PlayController controller) {
        this.playView.interact(controller);
    }

    @Override
    public void visit(ResumeController controller) {
        this.resumeView.interact(controller);
    }
}
