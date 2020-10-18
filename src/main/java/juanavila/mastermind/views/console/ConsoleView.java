package juanavila.mastermind.views.console;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;

public class ConsoleView extends MastermindView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleView(Mastermind game) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(game);
        this.resumeView = new ResumeView(game);
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
