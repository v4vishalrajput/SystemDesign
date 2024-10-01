package state;

import java.util.List;

import inventory.Item;
import machine.VendingMachine;

public interface State {
	
	public void insertCoinButton(VendingMachine machine) throws Exception;
	
	public void insertCoin(VendingMachine machine, int coin) throws Exception;
	
	public void selectProductButton(VendingMachine machine) throws Exception;
	
	public void chooseProduct(VendingMachine machine, int code) throws Exception;
	
	public void dispenseProduct(VendingMachine machine, int code) throws Exception;
	
	public List<Integer> refundMoney(VendingMachine machine) throws Exception;
	
	public int getChange(int amount) throws Exception;

}
