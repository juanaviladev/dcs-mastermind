package juanavila.mastermind.views;

import juanavila.mastermind.models.Color;

public class ColorView {

    private final Color color;

    public ColorView(Color color) {
        this.color = color;
    }

    public void print() {
        System.out.print(color.getInitial());
    }
}
