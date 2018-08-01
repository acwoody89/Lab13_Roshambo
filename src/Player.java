/**
 * 
 * @author Alex Wood
 * @since 31.7.2018
 * @version 1.0
 */
public abstract class Player {


	private Roshambo r;
	private String name;

	public abstract Roshambo generateRoshambo();


	public Roshambo getR() {
		return r;
	}

	public void setR(Roshambo r) {
		this.r = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public enum Roshambo {
		// enums passing in string parameters
		ROCK ("Rock"), PAPER ("Paper"), SCISSORS ("Scissors");

		
		private String value;

	    private Roshambo(String input) { // constructor method for enum Roshambo
	        this.value = input;
	    }
	    @Override
		public String toString() {
			return value;
		}
	}
	
}
