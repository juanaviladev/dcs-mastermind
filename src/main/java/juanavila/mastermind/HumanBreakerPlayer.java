package juanavila.mastermind;

import java.util.Scanner;

public class HumanBreakerPlayer implements Player {

    private Board board;

    public HumanBreakerPlayer(Board board) {
        this.board = board;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Propose a combination: ");
        String line = sc.nextLine();
        Color[] position = new Color[4];
        for(int i = 0; i < position.length;i++) {
            position[i] = Color.from(line.charAt(i));
        }

        ProposedCombination combination = new ProposedCombination(position);
        board.proposeCombination(combination);
    }

    public void announceWin() {
        System.out.println("You've won!!! ;-)");
    }
}
