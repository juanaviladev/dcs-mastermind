package juanavila.mastermind.console;

import juanavila.mastermind.models.Mastermind;

public class ConsoleView extends MastermindView {

    private Mastermind game;

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleView(Mastermind game) {
        this.game = game;
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    @Override
    void play() {
        boolean newGame;
        do {
            this.startView.interact();
            boolean finished;
            do {
                finished = this.proposalView.interact();
            } while (!finished);
            newGame = this.resumeView.interact();
        } while (newGame);
    }

    @Override
    boolean isResumed() {
        return resumeView.interact();
    }
}
