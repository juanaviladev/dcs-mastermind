package juanavila.mastermind.views;

import juanavila.mastermind.models.SecretCombination;
import juanavila.utils.Console;

public class SecretCombinationView {

    private SecretCombination combination;

    public SecretCombinationView(SecretCombination combination) {
        this.combination = combination;
    }

    public void print() {
        for(int i = 0; i < combination.size(); i++)
            Message.SECRET.write();

        Console.instance().writeln();
    }

}
