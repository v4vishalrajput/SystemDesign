package machine;

import java.util.ArrayList;
import java.util.List;

import inventory.Inventory;
import state.IdleState;
import state.State;

public class VendingMachine {
private Inventory inventory;
private State state;
private List<Integer> coinList;
private int totalAmountPaidByUser;

public VendingMachine(Inventory inventory) {
	super();
	this.inventory = inventory;
	setVendingMachineState(new IdleState());
	coinList = new ArrayList();
	totalAmountPaidByUser =0;
}

public void setVendingMachineState(State state) {
	this.state = state;
}

public State getVendingMachineState(State state) {
	return state;
}

public Inventory getInventory() {
	return inventory;
}

public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}

public List<Integer> getCoinList() {
	return coinList;
}

public void setCoinList(List<Integer> coinList) {
	this.coinList = coinList;
}

public void addCoin(int coin) {
	this.totalAmountPaidByUser+=coin;
	coinList.add(coin);
}

public void resetCoinList() {
	setCoinList(new ArrayList());
	totalAmountPaidByUser=0;
}

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}

public int getTotalAmountPaidByUser() {
	return this.totalAmountPaidByUser;
}


}
