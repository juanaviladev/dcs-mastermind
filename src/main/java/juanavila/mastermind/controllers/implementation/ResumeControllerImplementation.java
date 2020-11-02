package juanavila.mastermind.controllers.implementation;

import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    private SessionImplementation session;

    public ResumeControllerImplementation(SessionImplementation session) {
       this.session = session;
    }

    public void resume(boolean newGame) {
        if (newGame) {
            session.reset();
        } else {
            session.next();
        }
    }

}
