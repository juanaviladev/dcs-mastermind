package juanavila.mastermind;

import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends MastermindStarter {

    @Override
    MastermindView createView(ProposalController proposalController, ResumeController resumeController) {
        return new ConsoleView(proposalController, resumeController);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().start();
    }
}
