package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;

public class ConsoleView extends MastermindView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleView(Logic logic) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(logic);
        this.resumeView = new ResumeView(logic);
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
