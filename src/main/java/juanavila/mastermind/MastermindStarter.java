package juanavila.mastermind;

import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;

public abstract class MastermindStarter {

    private MastermindView view;

    public MastermindStarter() {
        Mastermind game = new Mastermind();

        ProposalController proposalController = new ProposalController(game);
        ResumeController resumeController = new ResumeController(game);

        this.view = createView(proposalController, resumeController);
    }

    void start() {
        view.interact();
    }

    abstract MastermindView createView(ProposalController proposalController, ResumeController resumeController);
}
