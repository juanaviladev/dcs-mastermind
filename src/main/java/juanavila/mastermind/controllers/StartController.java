package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;

public class StartController extends Controller implements AcceptorController {
    public StartController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
