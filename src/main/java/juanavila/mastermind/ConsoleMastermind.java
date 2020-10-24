package juanavila.mastermind;

import juanavila.mastermind.views.MastermindView;
import juanavila.mastermind.views.console.View;

public class ConsoleMastermind extends MastermindStarter {

    @Override
    MastermindView createView() {
        return new View();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().start();
    }
}
