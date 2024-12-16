package balance_sheet;

public class Balance {
	
	double amountOwe;
	double amountToGet;
	public Balance(double amountOwe, double amountToGet) {
		super();
		this.amountOwe = amountOwe;
		this.amountToGet = amountToGet;
	}
	public double getAmountOwe() {
		return amountOwe;
	}
	public void setAmountOwe(double amountOwe) {
		this.amountOwe = amountOwe;
	}
	public double getAmountToGet() {
		return amountToGet;
	}
	public void setAmountToGet(double amountToGet) {
		this.amountToGet = amountToGet;
	}
	
	

}
