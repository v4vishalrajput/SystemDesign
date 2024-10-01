package inventory;

import java.util.List;

public class Inventory {
 List<ItemShelf> itemShelves;

public Inventory(List<ItemShelf> itemShelves) {
	super();
	this.itemShelves = itemShelves;
}

public Item getItem(int code) {
	return itemShelves.get(getItemPosition(code)).getItem();
}

public void addItem(Item item, int code) {
	itemShelves.get(getItemPosition(code)).addItem(item);
}

public Item dispenseItem(int code) {
	return itemShelves.get(getItemPosition(code)).dispenseItem();
}

public void showItems() {
	for(ItemShelf shelf : itemShelves) {
		System.out.println("ITEM : "+shelf.getItem().getType().toString()+", CODE : "+shelf.code+", PRICE : "+shelf.getItem().getPrice());
	}
}
 
private int getItemPosition(int code) {
	return code - 100;
}
   
}
