package juanavila.mastermind.views.console;

public abstract class Command {

    private String title;


    public Command() {
    }

    public boolean isActive() {
        return false;
    }

    public String getTitle() {
        return "!";
    }

    public abstract void execute();
}
