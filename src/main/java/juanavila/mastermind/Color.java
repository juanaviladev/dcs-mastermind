package juanavila.mastermind;

public enum Color {
    RED("r"),
    BLUE("b"),
    YELLOW("y"),
    GREEN("g"),
    ORANGE("o"),
    PURPLE("p"),
    NULL("");

    private final String letter;

    Color(String letter) {
        this.letter = letter;
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
        System.out.print(this.letter);
    }
}
