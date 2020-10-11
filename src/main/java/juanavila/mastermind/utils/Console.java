package juanavila.mastermind.utils;

public class Console {

    private static Console instance;

    public static Console instance() {
        if(instance == null)
            instance = new Console();
        return instance;
    }

    public void write(String message, Object... params) {
        System.out.printf(message, params);
    }

    public void writeln(String message, Object... params) {
        System.out.printf(message, params);
        System.out.println();
    }

    public void newLine() {
        System.out.println();
    }
}
