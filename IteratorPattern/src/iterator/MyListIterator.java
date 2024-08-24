package iterator;

import collection.MyList;

public class MyListIterator implements Iterator{
	
	private MyList myList;
	private int cursor;
	
	public MyListIterator(MyList myList) {
        this.myList = myList;
        this.cursor = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor < myList.size();
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			return myList.get(cursor++);
		}
		return null;
	}

}
