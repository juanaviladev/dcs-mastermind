package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.Controller;
import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.controllers.StartController;
import juanavila.mastermind.views.MastermindView;

public class ConsoleView extends MastermindView {

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
        if (controller instanceof ProposalController) {
            this.proposalView.interact((ProposalController) controller);
        }
        else if(controller instanceof ResumeController) {
            this.resumeView.interact((ResumeController) controller);
        }
        else if(controller instanceof StartController) {
            this.startView.interact((StartController) controller);
        }
    }
}
