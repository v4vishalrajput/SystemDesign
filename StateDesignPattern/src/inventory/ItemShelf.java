package inventory;

public class ItemShelf {
  int code;
  Item item;
  int count;
public ItemShelf(int code, Item item, int count) {
	super();
	this.code = code;
	this.item = item;
	this.count = count;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
  
public void addItem(Item item) {
	this.count +=1;
}

public Item dispenseItem() {
	this.count -=1;
	return item;
}
  
  
}
