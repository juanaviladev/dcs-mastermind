package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

public enum Message {
    TITTLE("--- MASTERMIND ---"),
    SEPARATOR(" "),
    COMBINATION_PROPOSAL("Propose a combination: "),
    ATTEMPTS("%d attempt(s): "),
    RESUME("RESUME? (y/n): "),
    RESULT("%s ---> %d blacks and %d whites"),
    MAKER_WIN("You've lost!!! :-("),
    BREAKER_WIN("You've won!!! ;-)"),
    SECRET_POSITION("x"),
    NULL_MESSAGE();

    private String message;

    Message() {

    }

    Message(String message) {
        this.message = message;
    }

    void write(Object... params) {
        Console.instance().write(this.message, params);
    }

    void writeln(Object... params) {
        Console.instance().writeln(this.message,params);
    }

    @Override
    public String toString() {
        return this.message;
    }
}
