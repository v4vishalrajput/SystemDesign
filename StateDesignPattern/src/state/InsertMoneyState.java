package state;

import java.util.List;

import inventory.Item;
import machine.VendingMachine;

public class InsertMoneyState implements State {
	
	public InsertMoneyState() {
		System.out.println("Currently machine is in insert money state");
	}

	@Override
	public void insertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
        throw new Exception("Machine is already in insert coin state");
	}

	@Override
	public void insertCoin(VendingMachine machine, int coin) {
		// TODO Auto-generated method stub
		System.out.println("Inserted coin value "+ coin+" cents");
       machine.addCoin(coin);
       System.out.println("Total coin value "+machine.getTotalAmountPaidByUser());
	}

	@Override
	public void selectProductButton(VendingMachine machine) {
		// TODO Auto-generated method stub
		machine.setVendingMachineState(new SelectionState());
	}

	@Override
	public void chooseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
    throw new Exception("you cannot choose product in insert money state");
	}

	@Override
	public void dispenseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Product cannot be dispensed in insert coin state");
	}

	@Override
	public List<Integer> refundMoney(VendingMachine machine) {
		// TODO Auto-generated method stub
		System.out.println("Returning "+machine.getTotalAmountPaidByUser()+ " cents, Please collect it from money tray");
		machine.setVendingMachineState(new IdleState());
		return machine.getCoinList();
	}

	@Override
	public int getChange(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
