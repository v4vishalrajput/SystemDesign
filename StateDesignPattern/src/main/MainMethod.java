package main;

import java.util.ArrayList;
import java.util.List;

import inventory.Inventory;
import inventory.Item;
import inventory.ItemShelf;
import inventory.ItemType;
import machine.VendingMachine;
import state.State;

public class MainMethod {
	
public static void main(String[] args) {
	
	try {
	Inventory inventory = createInventory();
	VendingMachine machine = new VendingMachine(inventory);
	
	machine.getInventory().showItems();
	
	State machineState = machine.getState();
	
	machineState.insertCoinButton(machine);
	
	machineState=machine.getState();
	
	machineState.insertCoin(machine, 5);
//	machineState.insertCoin(machine, 14);
//	machineState.insertCoin(machine, 13);
	
	machineState.selectProductButton(machine);
	
	machineState=machine.getState();
	
	machineState.chooseProduct(machine, 101);
	
	machineState=machine.getState();
	
	machineState.dispenseProduct(machine, 101);
	
	} catch (Exception e) {
		System.out.println("Error: "+e.getMessage());
	}
}

public static Inventory createInventory() {
	
	ItemShelf shelf1 = new ItemShelf(100, new Item(ItemType.BISCUIT, 20) , 1);
	ItemShelf shelf2 = new ItemShelf(100, new Item(ItemType.COLA, 10) , 1);
	ItemShelf shelf3 = new ItemShelf(100, new Item(ItemType.KURKURE, 30) , 1);
	ItemShelf shelf4 = new ItemShelf(100, new Item(ItemType.WATER, 20) , 1);
	
	List<ItemShelf> itemShelves = new ArrayList<>();
	itemShelves.add(shelf1);
	itemShelves.add(shelf2);
	itemShelves.add(shelf3);
	itemShelves.add(shelf4);
	
	return new Inventory(itemShelves);
}

}
