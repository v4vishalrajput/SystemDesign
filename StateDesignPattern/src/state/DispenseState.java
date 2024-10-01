package state;

import java.util.List;

import inventory.Item;
import machine.VendingMachine;

public class DispenseState implements State{
	
	public DispenseState() {
		System.out.println("Currently machine is in dispense state");
	}

	@Override
	public void insertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
	  throw new Exception("You cannot click insert coin button in dispense state");
	}

	@Override
	public void insertCoin(VendingMachine machine, int coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("You cannot insert coin  in dispense state");
	}

	@Override
	public void selectProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("You cannot click select product button in dispense state");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("You cannot choose product in dispense state");
	}

	@Override
	public void dispenseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		Item item = machine.getInventory().getItem(code);
		System.out.println("Item "+item.getType()+" is dispensed please collect it from dispense tray");
	}

	@Override
	public List<Integer> refundMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("money can be refund in dispense state");
	}

	@Override
	public int getChange(int amount) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("change is not possible in dispense state");
	}

}
