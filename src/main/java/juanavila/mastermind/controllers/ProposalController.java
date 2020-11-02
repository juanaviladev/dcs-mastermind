package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Error;
import juanavila.mastermind.models.*;
import juanavila.mastermind.views.*;

import java.util.List;

public class ProposalController extends Controller {

	private ProposalView proposalView;

	public ProposalController(Mastermind game, State state) {
		super(game, state);
		this.proposalView = new ProposalView();
	}

	@Override
	public void control() {
		this.game.addProposedCombination(this.readProposal());
		this.writeAttempts();
		if(this.game.isFinished()) {
			this.writeGameResult();
			this.next();
		}
	}

	private void writeAttempts() {
		proposalView.writeAttempts(game.getAttempts());
		new SecretCombinationView().writeln(SecretCombination.getWidth());

		for (int i = 0; i < game.getAttempts(); i++) {
			List<Color> combinationColors = game.getProposedCombination(i).getColors();
			new ProposedCombinationView().write(combinationColors);

			Result result = game.getResult(i);
			new ResultView().writeln(result.getBlacks(), result.getWhites());

			proposalView.writeLineBreak();
		}
	}

	private ProposedCombination readProposal() {
		ProposedCombination proposedCombination = new ProposedCombination();
		Error error;
		do {
			error = null;
			this.proposalView.writeTitle();
			String characters = this.proposalView.readProposal();
			if (characters.length() > Combination.getWidth()) {
				error = Error.WRONG_LENGTH;
			} else {
				for (int i = 0; i < characters.length(); i++) {
					Color color = ColorView.getInstance(characters.charAt(i));
					if (color == null) {
						error = Error.WRONG_CHARACTERS;
					} else {
						if (proposedCombination.getColors().contains(color)) {
							error = Error.DUPLICATED;
						} else {
							proposedCombination.getColors().add(color);
						}
					}
				}
			}
			if (error != null) {
				new ErrorView(error).writeln();
				proposedCombination.getColors().clear();
			}
		} while (error != null);
		return proposedCombination;
	}

	private void writeGameResult() {
		if (this.game.isWinner()) {
			proposalView.writeWinner();
		} else if (this.game.isLooser()) {
			proposalView.writeLooser();
		}
	}

}
