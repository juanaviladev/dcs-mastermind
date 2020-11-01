package juanavila.mastermind.views;

import juanavila.mastermind.models.Color;
import juanavila.utils.WithConsoleView;

import java.util.List;

public class ProposedCombinationView extends WithConsoleView {
	
	public void write(List<Color> colors) {
		for (Color color: colors) {
			new ColorView(color).write();
		}
	}

}
