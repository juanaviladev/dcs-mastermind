package juanavila.mastermind.models;

import java.util.ArrayList;
import java.util.List;

abstract class Combination {

	protected List<Color> colors;
	
	protected Combination(ArrayList<Color> colors){
		this.colors = colors;
	}

	public int size() {
		return colors.size();
	}
}
