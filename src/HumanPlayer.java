import java.util.Scanner;
/**
 * 
 * @author Alex Wood
 * @since 31.7.2018
 * @version 1.0
 */
public class HumanPlayer extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Scanner scan = new Scanner(System.in);
		String choice = Validator.getRPS(scan, "(R)ock, (P)aper, or (S)cissors?"); // can't enter a number with .getRPS()
		System.out.println("*************************************");
		Roshambo result = null;
		
		
		if (choice.equalsIgnoreCase("r") || choice.equalsIgnoreCase("Rock")) {
			result = Roshambo.ROCK;
		} else if (choice.equalsIgnoreCase("p") || choice.equalsIgnoreCase("Paper")) {
			result = Roshambo.PAPER;
		} else if (choice.equalsIgnoreCase("s") || choice.equalsIgnoreCase("Paper")) {
			result = Roshambo.SCISSORS;
		}
		return result;
	}

}
