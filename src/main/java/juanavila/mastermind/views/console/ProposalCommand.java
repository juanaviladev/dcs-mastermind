package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;
import juanavila.mastermind.models.ProposedCombination;

public class ProposalCommand extends Command {

    public ProposalCommand(PlayController playController) {
        super(MessageView.PROPOSE_COMBINATION.getTitle(), playController);
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
        MessageView.SEPARATOR.writeln();
        MessageView.ATTEMPTS.writeln(playController.getAttempts());
        new SecretCombinationView().writeln();
        for (int i = 0; i < playController.getAttempts(); i++) {
            new ProposedCombinationView(playController.getProposedCombination(i)).write();
            new ResultView(playController.getResult(i)).writeln();
        }
        if (playController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (playController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }
}
