package juanavila.mastermind.controllers;

public interface ControllerVisitor {
  void visit(StartController controller);
  void visit(ProposalController controller);
  void visit(ResumeController controller);
}
