package juanavila.mastermind.controllers;

public abstract class ResumeController implements AcceptorController {

    public abstract void resume(boolean newGame);

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
