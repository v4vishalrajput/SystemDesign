package balance_sheet;

import java.util.List;

import split.Split;
import split.SplitType;
import user.User;

public class BalanceSheetController {
	
	public void updateBalanceSheet(User paidBy, double paidAmount,  List<Split> splitList) {
		
		BalanceSheet spenderBalanceSheet = paidBy.getBalanceSheet();
		
		spenderBalanceSheet.totalAmountPaid = spenderBalanceSheet.totalAmountPaid + paidAmount;
		
		
		for (Split split : splitList) {
			spenderBalanceSheet.totalGetBack += split.getAmountOwe();
			BalanceSheet oweeBalanceSheet = split.getOwedBy().getBalanceSheet();
			if(!spenderBalanceSheet.usersBalance.containsKey(split.getOwedBy().getId())) {
				Balance balance = new Balance(0, 0);
				spenderBalanceSheet.usersBalance.put(split.getOwedBy().getId(), balance);
			}
			Balance oweUserBalanceInUserPaid = spenderBalanceSheet.usersBalance.get(split.getOwedBy().getId());
			oweUserBalanceInUserPaid.amountToGet += split.getAmountOwe();
			
			if(!oweeBalanceSheet.usersBalance.containsKey(paidBy.getId())) {
				Balance balance = new Balance(0, 0);
				oweeBalanceSheet.usersBalance.put(paidBy.getId(), balance);
			}
			
			Balance paidByUserBalanceInOweAccount = oweeBalanceSheet.usersBalance.get(paidBy.getId());
			paidByUserBalanceInOweAccount.amountOwe += split.getAmountOwe();
			
			oweeBalanceSheet.totalOwe += split.getAmountOwe();
			
		}
		
		
	}

}
