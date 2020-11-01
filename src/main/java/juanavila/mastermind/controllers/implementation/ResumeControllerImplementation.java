package juanavila.mastermind.controllers.implementation;

import juanavila.mastermind.controllers.ResumeController;
import juanavila.mastermind.models.InMemorySession;

public class ResumeControllerImplementation extends ResumeController {

    private InMemorySession session;

    public ResumeControllerImplementation(InMemorySession session) {
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
