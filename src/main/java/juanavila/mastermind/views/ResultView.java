package juanavila.mastermind.views;

import juanavila.mastermind.models.Result;

public class ResultView {

    private final Result result;

    public ResultView(Result result) {
        this.result = result;
    }

    public void print() {
        Message.RESULT.writeln(result.getBlacks(), result.getWhites());
    }
}
