package juanavila.mastermind.views.console;

import juanavila.mastermind.models.Color;
import juanavila.mastermind.models.Error;
import juanavila.mastermind.models.Combination;
import juanavila.mastermind.models.ProposedCombination;
import juanavila.utils.WithConsoleView;

class ProposedCombinationView extends WithConsoleView {
	
	private ProposedCombination proposedCombination;

	ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	void write() {
		for (Color color: this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	void read() {
		Error error;
		do {
			error = null;
			MessageView.PROPOSE_COMBINATION.write();
			String characters = this.console.readString();
			if (characters.length() > Combination.getWidth()) {
				error = Error.WRONG_LENGTH;
			} else {
				for (int i = 0; i < characters.length(); i++) {
					Color color = ColorView.getInstance(characters.charAt(i));
					if (color == null) {
						error = Error.WRONG_CHARACTERS;
					} else {
						if (this.proposedCombination.getColors().contains(color)) {
							error = Error.DUPLICATED;
						} else {
							this.proposedCombination.getColors().add(color);
						}
					}
				}
			}
			if (error != null) {
				new ErrorView(error).writeln();
				this.proposedCombination.getColors().clear();
			}
		} while (error != null);
	}

}