
public class Player {

	private String name;
	private static Die die;
	
	//Initialize the fields
	public Player(String name){
		die = new Die();
		
		this.name = name;
	}
	
	/**
	 * This method plays out the player's turn.
	 * @return The number of spaces to move on the board.
	 */
	public int takeTurn(){
		
		int  roll = die.rollD6(); 
		
		System.out.println(name + " rolled " + roll + ".");
		
		return roll;
	}
	
	
	public String toString(){
		return name;
	}
}
