package juanavila.mastermind;

import juanavila.mastermind.models.Game;
import juanavila.mastermind.views.View;

public class Mastermind {

	private Game game;
	
	private View view;

	private Mastermind() {
		this.game = new Game();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}	

}
