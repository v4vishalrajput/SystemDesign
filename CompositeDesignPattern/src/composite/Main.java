package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Directory directory1= new Directory("Movies");
		Directory directory2= new Directory("ComedyMovies");
		directory1.addComponent(new File("Dune"));
		directory1.addComponent(directory2);
		directory2.addComponent(new File("Dhol"));
		
		directory1.ls();

	}

}
