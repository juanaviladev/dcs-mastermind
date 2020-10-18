package juanavila.mastermind;

import juanavila.mastermind.controllers.Logic;
import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends MastermindStarter {

    @Override
    MastermindView createView(Logic logic) {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().start();
    }
}
