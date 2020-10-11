package juanavila.mastermind.utils;

import java.util.Scanner;

public class Console {

    private static Console instance;

    public static Console instance() {
        if(instance == null)
            instance = new Console();
        return instance;
    }

    private Scanner sc = new Scanner(System.in);

    public void write(String message, Object... params) {
        System.out.printf(message, params);
    }

    public void writeln(String message, Object... params) {
        System.out.printf(message, params);
        System.out.println();
    }

    public void writeError(String message, Object... params) {
        System.out.printf("ERROR: "+message, params);
        System.out.println();
    }

    public void writelnError(String message, Object... params) {
        System.out.printf("ERROR: "+message, params);
        System.out.println();
    }

    public String readString() {
        return sc.nextLine();
    }

    public String readString(String message) {
        write(message);
        return readString();
    }

    public char readChar() {
        String inputText;
        boolean ok;
        char read = ' ';
        do {
            inputText = readString();
            if(inputText.length() != 1) {
                writelnError("Please, enter only 1 character");
                ok = false;
            }
            else {
                read = inputText.charAt(0);
                ok = true;
            }
        }
        while(!ok);

        return read;
    }

    public void newLine() {
        System.out.println();
    }
}
