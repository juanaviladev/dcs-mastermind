package juanavila.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {

    private List<GameMemento> mementos;
    private Mastermind mastermind;
    private int actualIndex;

    public GameRegistry(Mastermind mastermind) {
        this.mementos = new ArrayList<>();
        this.mastermind = mastermind;
        this.actualIndex = 0;
        this.mementos.add(this.mastermind.createMemento());
    }

    void register() {
        this.actualIndex++;
        this.mementos.add(this.mastermind.createMemento());
    }

    void undo() {
        this.actualIndex--;
        this.mastermind.restore(this.mementos.get(this.actualIndex));
    }

    void redo() {
        this.actualIndex++;
        this.mastermind.restore(this.mementos.get(this.actualIndex));
    }

    boolean isUndoable() {
        return this.actualIndex > 0;
    }

    boolean isRedoable() {
        return this.actualIndex < this.mementos.size() - 1;
    }
}
