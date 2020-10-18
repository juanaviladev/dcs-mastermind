package juanavila.mastermind.console;

public abstract class MastermindView {

    public void interact() {
        do {
            this.play();
        } while (this.isResumed());
    }

    abstract void play();

    abstract boolean isResumed();

}
