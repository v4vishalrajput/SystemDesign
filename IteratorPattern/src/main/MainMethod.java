package main;

import collection.MyList;
import iterator.Iterator;

public class MainMethod {
	
	
public static void main(String[] args) {
	
	MyList mylist = new MyList();
	mylist.add(1);
	mylist.add(2);
	mylist.add(8);
	
	Iterator itr = mylist.iterator();
	
	System.out.println(itr.next());

	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

}
