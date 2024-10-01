package state;

import java.util.List;

import machine.VendingMachine;

public class IdleState implements State{
	
	public IdleState() {
		System.out.println("Currently machine is in idle state");
	}

	@Override
	public void insertCoinButton(VendingMachine machine)  throws Exception {
		// TODO Auto-generated method stub
		machine.setVendingMachineState(new InsertMoneyState());
	}

	@Override
	public void insertCoin(VendingMachine machine, int coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Click insertCoinButton before inserting the coin..");
	}

	@Override
	public void selectProductButton(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Insert coin before clicking on select product button");
	}

	@Override
	public void chooseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Insert coin before choosing the product");
	}

	@Override
	public void dispenseProduct(VendingMachine machine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Insert coin and select product before dispense");
	}

	@Override
	public List<Integer> refundMoney(VendingMachine machine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("First Insert the coins");
	}

	@Override
	public int getChange(int amount) throws Exception  {
		// TODO Auto-generated method stub
		throw new Exception("First Insert the coins");
	}

}
