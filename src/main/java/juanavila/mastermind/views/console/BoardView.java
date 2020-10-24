package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;

public class BoardView {

    private final PlayController controller;

    public BoardView(PlayController controller) {
        this.controller = controller;
    }

    public void write() {
        MessageView.ATTEMPTS.writeln(controller.getAttempts());
        new SecretCombinationView().writeln();
        for (int i = 0; i < controller.getAttempts(); i++) {
            new ProposedCombinationView(controller.getProposedCombination(i)).write();
            new ResultView(controller.getResult(i)).writeln();
        }
    }
}
