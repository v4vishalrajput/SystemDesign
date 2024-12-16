package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem {
	
    private String name;
    private List<FileSystem> list;
    
    public Directory(String name) {
    	this.name=name;
    	list=new ArrayList<>();
    }

	@Override
	public void ls() {
		// TODO Auto-generated method stub
		System.out.println("Directory Name "+name);
		
		for(FileSystem fs : list) {
			fs.ls();
		}
      
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addComponent(FileSystem comp) {
		list.add(comp);
	}

}
