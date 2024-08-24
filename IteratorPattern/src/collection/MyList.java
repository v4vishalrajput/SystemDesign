package collection;

import java.util.ArrayList;
import java.util.List;

import iterator.Iterator;
import iterator.MyListIterator;

public class MyList implements Iterable{
	
	private List<Integer> list;
	
	public MyList() {
		list = new ArrayList<>();
	}
	
	public void add(int val) {
		list.add(val);
	}
	
	public int get(int idx) {
		return list.get(idx);
	}
	
	public int size() {
		return list.size();
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		 return new MyListIterator(this);
	}

	
	
}
