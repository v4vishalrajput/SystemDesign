package user;

import java.util.ArrayDeque;
import java.util.Scanner;

public class TicTacToe {
	
	Board board;
	ArrayDeque<User> users;
	
	public TicTacToe(){
		initializeGame();
	}
	
	void initializeGame() {
		User user1 = new User("Vishal", PieceType.O, 3);
		User user2 = new User("Rahul", PieceType.X, 3);
		
		users = new ArrayDeque<>();
		
		users.add(user1);
		users.add(user2);
		
		board = new Board(3);
	}
	
	public String startGame() {
		
		System.out.println("--------TIC TAC TOE-------");
		
		boolean noWinner = true;
		
		while(noWinner) {
			
			if(!board.hasCells()) {
				break;
			}
			
			User usersTurn = users.remove();
			
			board.printBoard();
			
			System.out.print("PLAYER "+usersTurn.name+" Enter row,column: ");
			Scanner scn = new Scanner(System.in);
			String move = scn.next();
			String values [] = move.split(",");
			int inputRow = Integer.parseInt(values[0]);
			int inputColumn = Integer.parseInt(values[1]);
			
			boolean moveMadeSuccessfully = board.newMove(inputRow, inputColumn, usersTurn);
			
			if(!moveMadeSuccessfully) {
				System.out.println("Incorrect position choosen, Choose again!!");
				users.addFirst(usersTurn);
				continue;
			}
			
			if(board.isWinner(usersTurn)) {
				board.printBoard();
				return "Game winner is "+usersTurn.name;
			}
			
			users.addLast(usersTurn);
		}
		
		return "It's a tie";
		
	}
	
	

}
