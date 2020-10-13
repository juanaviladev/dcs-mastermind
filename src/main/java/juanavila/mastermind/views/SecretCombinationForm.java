package juanavila.mastermind.views;

import juanavila.mastermind.models.Color;
import juanavila.mastermind.models.Result;
import juanavila.mastermind.models.SecretCombination;
import juanavila.utils.Console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SecretCombinationForm {

    public SecretCombination read() {
        ArrayList<Color> colors = new ArrayList<>();
        for(int i = 0; i< Color.length(); i++) {
            colors.add(Color.get(i));
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < Color.length() - Result.WIDTH; i++) {
            colors.remove(random.nextInt(colors.size()));
        }
        Collections.shuffle(colors);
        return new SecretCombination(colors);
    }

}
