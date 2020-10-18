package juanavila.mastermind;

import juanavila.mastermind.controllers.ProposalController;
import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends MastermindStarter {

    @Override
    MastermindView createView(ProposalController proposalController, ResumeController resumeController) {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().start();
    }
}
