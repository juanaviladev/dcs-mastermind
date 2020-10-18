package juanavila.mastermind;

import juanavila.mastermind.console.ConsoleView;
import juanavila.mastermind.console.MastermindView;
import juanavila.mastermind.models.Mastermind;

public class ConsoleMastermind {

    private MastermindView view;

    public ConsoleMastermind() {
        Mastermind mastermind = new Mastermind();
        this.view = new ConsoleView(mastermind);
    }

    void start() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().start();
    }
}
