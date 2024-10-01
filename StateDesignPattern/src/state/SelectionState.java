package state;

import java.util.List;

import inventory.Item;
import machine.VendingMachine;

public class SelectionState implements State {

	public SelectionState() {
		super();
		System.out.println("Machine is in selection state");
	}

	@Override
	public void insertCoinButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Coin cannot be inserted in selection state");
	}

	@Override
	public void insertCoin(VendingMachine machine, int coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Coin cannot be inserted in selection state");
	}

	@Override
	public void selectProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void chooseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
       
		int paidByUser = machine.getTotalAmountPaidByUser();
		Item item = machine.getInventory().getItem(code);
		
		if(paidByUser<item.getPrice()) {
			System.out.println("Insufficient Balance, Item you selected costs "+machine.getInventory().getItem(code).getPrice()+ " you paid "+paidByUser);
			refundMoney(machine);
			throw new Exception("Insufficient Balance");
		}else {
			if(item.getPrice()<paidByUser) {
				
				int change = this.getChange(paidByUser-item.getPrice());
				
				System.out.println("Please collect "+change+" cents from money tray");
			}
			machine.setVendingMachineState(new DispenseState());
		}
		
	}

	@Override
	public void dispenseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
      throw new Exception("Cann't despense product in selection state");
	}

	@Override
	public List<Integer> refundMoney(VendingMachine machine) {
		// TODO Auto-generated method stub
		System.out.println("Returning "+machine.getTotalAmountPaidByUser()+ " cents, Please collect it from money tray");
		machine.setVendingMachineState(new IdleState());
		return machine.getCoinList();
	}

	@Override
	public int getChange(int amount) throws Exception {
		// TODO Auto-generated method stub
		return amount;
	}

}
