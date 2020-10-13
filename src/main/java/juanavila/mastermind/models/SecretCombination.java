package juanavila.mastermind.models;

import java.util.ArrayList;
import java.util.Random;

import juanavila.utils.Console;

import java.util.Collections;

public class SecretCombination extends Combination {

	public SecretCombination(ArrayList<Color> colors) {
		super(colors);
	}

	Result getResult(ProposedCombination proposedCombination) {
		int blacks = 0;
		for (int i = 0; i < this.colors.size(); i++) {
			if (proposedCombination.contains(this.colors.get(i), i)) {
				blacks++;
			}
		}
		int whites = 0;
		for (Color color : this.colors) {
			if (proposedCombination.contains(color)) {
				whites++;
			}
		}
		return new Result(blacks, whites - blacks);
	}
}
