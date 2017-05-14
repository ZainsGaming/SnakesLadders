import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakesLadders {

	public static void main(String[] args){
		//Print welcome message.
		System.out.println("Welcome to Snakes & Ladders");
		System.out.println("Created by ZainsGaming");
	
		//Initialize scanner.
		Scanner scan = new Scanner (System.in);
		
		//Prompt for number of players.
		int numPlayers = 0;
		while (numPlayers <= 0 || numPlayers >6 ){
			System.out.print("Please enter the number of player (1-6): " );
			numPlayers = scan.nextInt();
		}
		
		//Initialize the players.
		List<Player> players = new ArrayList<Player>();
		for (int idx = 0; idx < numPlayers; idx++){
			Player player = new Player("P" + idx);
			players.add(player);
		}
		
		//Initialize the board.
		Board board = new Board(players);
		
		//Loop until a player reaches the final spot.
		//Players take turns to roll the die and move on the board
		boolean done = false;
		int playerIdx = 0;
		while (!done){
			//Player takes turn
			Player currPlayer = players.get(playerIdx);
			int roll = currPlayer.takeTurn();
			
			//Update the board
			done = board.movePlayer(currPlayer, roll);
			
			//Print the board
			System.out.println(board);
			System.out.println("-----------------------\n");
			
			//If we're done, print end message.
			if (done){
				System.out.println(currPlayer + " wins");
			}
			
			//Set up for next player
			playerIdx++;
			if (playerIdx == numPlayers){
				playerIdx = 0;
			}
			
		}
	}
}
