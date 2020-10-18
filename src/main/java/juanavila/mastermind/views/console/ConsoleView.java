package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.views.MastermindView;

public class ConsoleView extends MastermindView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleView(ProposalController proposalController, ResumeController resumeController) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(proposalController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    public void play() {
        this.startView.interact();
        boolean finished;
        do {
            finished = this.proposalView.interact();
        } while (!finished);
    }

    @Override
    public boolean isResumed() {
        return resumeView.interact();
    }
}
