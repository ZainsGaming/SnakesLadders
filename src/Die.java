import java.util.Random;

public class Die {

	private Random random;
	
	/**
	 * Initialize the fields
	 */
	public Die(){
		random = new Random();
	}
	
	
	/**
	 * Rolls a D6 and returns the value.
	 * @return An random int value between 1-6 (inclusive)
	 */
	public int rollD6(){
		return random.nextInt(6)+1;
	}
}
