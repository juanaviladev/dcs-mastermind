package juanavila.mastermind.views;

public abstract class MastermindView {

    public void interact() {
        do {
            this.play();
        } while (this.isResumed());
    }

    public abstract void play();

    public abstract boolean isResumed();

}
