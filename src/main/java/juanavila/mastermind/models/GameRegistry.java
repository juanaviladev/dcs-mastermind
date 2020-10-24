package juanavila.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

    private List<GameMemento> mementos;
    private Mastermind mastermind;
    private int firstPrevious;

    public GameRegistry(Mastermind mastermind) {
        this.mementos = new ArrayList<>();
        this.mastermind = mastermind;
        this.firstPrevious = 0;
        this.mementos.add(this.mastermind.createMemento());
    }

    void register() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.mementos.remove(0);
            this.firstPrevious--;
        }
        this.mementos.add(this.firstPrevious, this.mastermind.createMemento());
    }

    void undo() {
        this.firstPrevious++;
        this.mastermind.restore(this.mementos.get(this.firstPrevious));
    }

    void redo() {
        this.firstPrevious--;
        this.mastermind.restore(this.mementos.get(this.firstPrevious));
    }

    boolean isUndoable() {
        return this.firstPrevious < this.mementos.size() - 1;
    }

    boolean isRedoable() {
        return this.firstPrevious >= 1;
    }
}
