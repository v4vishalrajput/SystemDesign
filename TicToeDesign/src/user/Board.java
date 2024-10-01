package user;

public class Board {
 PieceType [][] board;
 int totalMoveMade;
 public Board(int n) {
	 board = new PieceType[n][n];
	 totalMoveMade = 0;
 }
 
 public boolean hasCells() {
	 return totalMoveMade<(board.length*board.length);
 }
 
 public boolean newMove(int sr, int sc, User user) {
	 if(board[sr][sc]!=null) return false;
	 else {
		 board[sr][sc] = user.pieceType;
         user.data.newMove(sr, sc);
		 totalMoveMade++;
		 return true;
	 }
 }
 
 public boolean isWinner(User user) {
	 return user.data.isWinner();
 }
 
 public void printBoard() {
	 for(int i=0;i<board.length;i++) {
		 boolean isFirst = true;
		 for(int j=0;j<board.length;j++) {
			 if(isFirst) {
				 System.out.print("|");
				 isFirst = false;
			 }
			 System.out.print((board[i][j]==null?" ":board[i][j]) + "|");
		 }
		 System.out.println();
	 }
 }
 
}
