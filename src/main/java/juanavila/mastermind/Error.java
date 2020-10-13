package juanavila.mastermind;

import juanavila.mastermind.utils.Console;

public enum Error {
    WRONG_PROPOSAL_LENGTH("Wrong proposed combination length"),
    WRONG_COLORS("Wrong colors, they must be: %s"),
    NULL_ERROR;

    private String message;

    Error() {

    }

    Error(String message) {
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
