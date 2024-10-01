package user;

public class User {
 public String name;
 PieceType pieceType;
 public UserData data;
public User(String name, PieceType pieceType, int n) {
	super();
	this.name = name;
	this.pieceType = pieceType;
	setUserData(n);
}

public void setUserData(int n) {
	data = new UserData(n);
}
 
}
