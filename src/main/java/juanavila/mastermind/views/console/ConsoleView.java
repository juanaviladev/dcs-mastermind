package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.*;
import juanavila.mastermind.views.MastermindView;

public class ConsoleView extends MastermindView implements ControllerVisitor {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleView() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController controller) {
        this.startView.interact(controller);
    }

    @Override
    public void visit(ProposalController controller) {
        this.proposalView.interact(controller);
    }

    @Override
    public void visit(ResumeController controller) {
        this.resumeView.interact(controller);
    }
}
