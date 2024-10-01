package user;

public class UserData {
 public int[] row;
 public int [] col;
 public int dia;
 public int antiDia;
  
  public UserData(int n) {
	  row = new int[n];
	  col = new int[n];
	  dia = 0;
	  antiDia = 0;
  }
  
  public void newMove(int sr, int sc) {
	  row[sr]++;
	  col[sc]++;
	 if(sr+sc == row.length-1) dia++;
	 if(sr == sc) antiDia++;
  }
  
  public boolean isWinner() {
	  int n = row.length;
	  
	  for(int i=0;i<n;i++) {
		  if(row[i]==n || col[i]==n) return true; 
	  }
	  
	  return (dia==n) || (antiDia==n);
  }
}
