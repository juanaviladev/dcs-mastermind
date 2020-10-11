package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

import java.util.Random;

public enum Color {
    RED("r"),
    BLUE("b"),
    YELLOW("y"),
    GREEN("g"),
    ORANGE("o"),
    PURPLE("p"),
    NULL();

    private String letter;
    private static final Random random = new Random();

    Color(String letter) {
        this.letter = letter;
    }

    Color() {

    }

    public static Color random() {
        Color[] possibleValues = Color.values();
        return possibleValues[random.nextInt(possibleValues.length)];
    }

    public static String palette() {
        String colors = "";
        for(Color color : Color.values()) {
            colors += color.letter;
        }
        return colors;
    }

    public boolean isNull() {
        return this == Color.NULL;
    }

    public static Color from(char value) {
        String valueText = value + "";
        for(Color color : Color.values()) {
            if(color.letter.equals(valueText))
                return color;
        }
        return Color.NULL;
    }

    public void print() {
        Console.instance().write(this.letter);
    }
}
