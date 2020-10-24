package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.models.ProposedCombination;

public class ProposalCommand extends Command {

    public ProposalCommand(PlayController playController) {
        super(MessageView.PROPOSAL_COMMAND.getTitle(), playController);
    }

    @Override
    public boolean isActive() {
        return !playController.isFinished();
    }

    @Override
    public void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        playController.addProposedCombination(proposedCombination);
        if (playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }
}
