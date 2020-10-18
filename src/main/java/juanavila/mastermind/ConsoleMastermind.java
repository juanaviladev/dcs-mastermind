package juanavila.mastermind;

import juanavila.mastermind.models.Mastermind;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends MastermindStarter {

    @Override
    MastermindView createView(Mastermind mastermind) {
        return new ConsoleView(mastermind);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().start();
    }
}
