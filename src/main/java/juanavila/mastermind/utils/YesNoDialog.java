package juanavila.mastermind.utils;

public class YesNoDialog {

    private static final char YES_TOKEN = 'y';
    private static final char NO_TOKEN = 'n';
    private static final String DIALOG_TEXT = "(" + YES_TOKEN + "/" + NO_TOKEN + "): ";

    public boolean ask(String prefixMessage) {
        Console.instance().write(prefixMessage);
        return ask();
    }

    public boolean ask() {
        showQuestion();
        char answer = readAnswer();
        return isAffirmative(answer);
    }

    private boolean isAffirmative(char answer) {
        return answer == YES_TOKEN;
    }

    private void showQuestion() {
        Console.instance().write(DIALOG_TEXT);
    }

    private char readAnswer() {
        return Console.instance().readChar();
    }

}
