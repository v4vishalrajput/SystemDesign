package composite;

public class File extends FileSystem {
	
	private String name;
	
	public File(String name) {
		this.name=name;
	}

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("File Name "+name);

	}

}
