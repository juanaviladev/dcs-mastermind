package juanavila.mastermind;

import juanavila.mastermind.controllers.Controller;
import juanavila.mastermind.controllers.Logic;

public class MastermindStarter {

    private Logic logic;

    public MastermindStarter() {
        this.logic = new Logic();
    }

    void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new MastermindStarter().play();
    }

}
