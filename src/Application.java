import java.util.Scanner;

/**
 * 
 * @author Alex Wood
 * @since 31.7.2018
 * @version 1.0
 */
public class Application {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] winLoss = {0,0,0}; // win,loss,tie
		String inputCont = "";
		
		HumanPlayer userPlayer = new HumanPlayer();
		userPlayer.setName(Validator.getString(scan, "What is your name?"));
		
		int inputOpp = Validator.getInt(scan, "Your opponent can be (1)Random Player or (2)Rock Player...", 1, 2);
		
		// created outside of the loop, wasn't felt safer b/c of scope in the do...while
		RandomPlayer randPlayer = new RandomPlayer();
		randPlayer.setName("Random Player");
		
		RockPlayer1 rockPlayer = new RockPlayer1();
		rockPlayer.setName("Rock Player");
		do {
			System.out.println("*************************************");
			
			userPlayer.setR(userPlayer.generateRoshambo()); // generates userPlayer Roshambo results
			
			
			 // Random Player is selected. Displays userPlayer and randPlayer generated results.
			 // then puts those results in as parameters for the winRoshambo() method.
			 
			if (inputOpp == 1) {
				randPlayer.setR(randPlayer.generateRoshambo());
				System.out.println(userPlayer.getR().toString() + " vs " + randPlayer.getR().toString());
				winRoshambo(userPlayer.getR().ordinal(), randPlayer.getR().ordinal(), userPlayer.getName(), randPlayer.getName(), winLoss);
				
				// Rock Player is selected. Displays userPlayer and randPlayer generated results.
				// then puts those results in as parameters for the winRoshambo() method.
			} else if (inputOpp == 2) {
				rockPlayer.setR(rockPlayer.generateRoshambo());
				System.out.println(userPlayer.getR().toString() + " vs " + rockPlayer.getR().toString());
				winRoshambo(userPlayer.getR().ordinal(), rockPlayer.getR().ordinal(), userPlayer.getName(), rockPlayer.getName(), winLoss);

			}
			System.out.println("*************************************");
			inputCont = Validator.getString(scan, "Play Again? y/n");

		} while (inputCont.equalsIgnoreCase("y"));
	}
	
	/*
	 * passes in ordinal, ordinal, player1 name, player2 name, int array tracking win/loss/tie
	 */
	public static void winRoshambo(int p1, int p2, String player1, String player2, int[] winLoss) {
		//if player 1 is rock
		if(p1 ==0 && p2 == 2 ) {
			System.out.println(player1 + " Wins!");
			winLoss[0]+=1;
		}else if(p1 ==0 && p2 == 0 ) {
			System.out.println(player1 + " and " + player2 + " tie.");
			winLoss[2] +=1;
		} else if(p1 ==0 && p2 == 1 ) {
			System.out.println(player2 + " Wins!");
			winLoss[1]+=1;
		}
		
		// if player 1 is paper
		if(p1 ==1 && p2 == 0 ) {
			System.out.println(player1 + " Wins!");
			winLoss[0]+=1;
		}else if(p1 ==1 && p2 == 1 ) {
			System.out.println(player1 + " and " + player2 + " tie.");
			winLoss[2] +=1;
		} else if(p1 ==1 && p2 == 2 ) {
			System.out.println(player2 + " Wins!");
			winLoss[1]+=1;
		}
		
		// if player 1 is scissors
		if(p1 ==2 && p2 == 1 ) {
			System.out.println(player1 + " Wins!");
			winLoss[0]+=1;
		}else if(p1 ==2 && p2 == 2 ) {
			System.out.println(player1 + " and " + player2 + " tie.");
			winLoss[2] +=1;
		} else if(p1 ==2 && p2 == 0 ) {
			System.out.println(player2 + " Wins!");
			winLoss[1] +=1;	
		}
		// updates the win/loss/tie scores
		System.out.println("Win's: " + winLoss[0] + ", Losses: " + winLoss[1]
				+ ",Tie's: " + winLoss[2]);
	}
	
}
