package juanavila.mastermind;

import juanavila.mastermind.models.Board;
import juanavila.mastermind.views.BoardView;
import juanavila.mastermind.views.GameView;
import juanavila.mastermind.views.ProposedCombinationForm;
import juanavila.utils.YesNoDialog;

public class Mastermind {

	private Board board;
	private GameView gameView;

	public Mastermind() {
		this.board = new Board();
		this.gameView = new GameView(this.board);
	}

	public void play() {
		gameView.interact();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
