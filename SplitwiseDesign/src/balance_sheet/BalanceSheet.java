package balance_sheet;

import java.util.HashMap;

import user.User;

public class BalanceSheet {
	
	double totalAmountPaid;
	double totalExpense;
	double totalOwe;
	double totalGetBack;
	HashMap<Integer, Balance> usersBalance;
	
	public BalanceSheet() {
		super();
		this.totalAmountPaid = 0;
		this.totalExpense = 0;
		this.totalOwe = 0;
		this.totalGetBack = 0;
		this.usersBalance = new HashMap<>();
	}

}
