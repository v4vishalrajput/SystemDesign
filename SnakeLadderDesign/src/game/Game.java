package game;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Game {
  private Board board;
  private Dice dice;
  
  Game() {
	  board = new Board(10, 5, 7);
	  dice = new Dice(2);
  }
  
  public void start() {
	  
	  System.out.println("Snake-Ladder game started..");
	  Scanner scn = new Scanner(System.in);
	  System.out.print("No. of players wants to play: ");
	  int noOfPlayers = scn.nextInt();
	  
	  Queue<Player> players = new ArrayDeque<>();
	  
	  for(int i=1;i<=noOfPlayers;i++) {
		  Player p = new Player(i, 0);
		  players.add(p);
	  }
	  
	  Player winner = null;
	  
	  while(winner==null) {
		  
		  Player playerTurn = players.remove();
		  
		  System.out.println("Player " + playerTurn.id +" postion is "+playerTurn.position);
		  
		  
		  
		  int move = dice.rollDice();
		  int newPos = board.getNewPosition(playerTurn.position, move);
		  
		  System.out.println("Player " + playerTurn.id +" new position is "+newPos);
		  
		  if(newPos==(board.size*board.size)-1) {
			  winner = playerTurn;
		  }
		  
		  if(newPos>(board.size*board.size)-1) {
			  System.out.println("Player cannot jump to position outside the board");
			  players.add(playerTurn);
			  continue;
		  }
		  
		  playerTurn.position = newPos;
		  
		  players.add(playerTurn);
		  
	  }
	  
	  System.out.print("The winner is Player "+winner.id);
	  
  }
  
}
