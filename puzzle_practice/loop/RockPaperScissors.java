package puzzle_practice.loop;

import java.util.Random;

/**
 * Created by SuCong on 2015/09/22.
 */
public class RockPaperScissors {
    private static final int ROCK = 1;
    private static final int PAPER = 2;
    private static final int SCISSOR = 3;

    private static final int[] oneGroup = {ROCK, PAPER, SCISSOR};

    public RockPaperScissors() {
        super();
    }

    public void getResult(int action) {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        int comChoose = oneGroup[randomNumber];
        if (action > comChoose) {
            System.out.println("User win!");
        } else if (action < comChoose) {
            System.out.println("Computer win!");
        } else {
            System.out.println("Tie!");
        }
    }
}
