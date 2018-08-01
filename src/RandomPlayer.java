import java.util.Random;
/**
 * 
 * @author Alex Wood
 * @since 31.7.2018
 * @version 1.0
 */
public class RandomPlayer extends Player{

	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Roshambo choice = null;
		
		// ordinal positioning 0,1,2 = rock,paper,scissors
		if(num < 1) {
			choice = Roshambo.ROCK;
		} else if (num >= 1 && num < 2) {
			choice = Roshambo.PAPER;
		} else if (num >= 2) {
			choice = Roshambo.SCISSORS;
		
		}
		
		return choice;
	}

}
