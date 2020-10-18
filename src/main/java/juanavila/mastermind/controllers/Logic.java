package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.mastermind.models.Result;

public class Logic {

    private Mastermind game;

    private ProposalController proposalController;
    private ResumeController resumeController;

    public Logic() {
        this.game = new Mastermind();
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public void addProposedCombination(ProposedCombination combination) {
        this.proposalController.addProposedCombination(combination);
    }

    public int getAttempts() {
        return proposalController.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return proposalController.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return proposalController.getResult(position);
    }

    public boolean isWinner() {
        return proposalController.isWinner();
    }

    public boolean isLooser() {
        return proposalController.isLooser();
    }

    public void resume() {
        resumeController.resume();
    }
}
