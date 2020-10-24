package juanavila.mastermind.views.console;

import juanavila.mastermind.controllers.PlayController;

public abstract class Command {

    private String title;
    protected PlayController playController;

    public Command(String title, PlayController controller) {
        this.title = title;
        this.playController = controller;
    }

    public abstract boolean isActive();

    public abstract void execute();

    public String getTitle() {
        return title;
    }
}
