package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.restart();
            reset();
        } else {
            next();
        }
    }

}
