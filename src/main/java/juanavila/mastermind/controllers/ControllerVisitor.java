package juanavila.mastermind.controllers;

public interface ControllerVisitor {
  void visit(StartController controller);
  void visit(PlayController controller);
  void visit(ResumeControllerImplementation controller);
}
