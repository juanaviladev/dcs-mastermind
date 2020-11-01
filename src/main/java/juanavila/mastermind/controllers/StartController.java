package juanavila.mastermind.controllers;

public abstract class StartController implements AcceptorController {
    public abstract void start();

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
