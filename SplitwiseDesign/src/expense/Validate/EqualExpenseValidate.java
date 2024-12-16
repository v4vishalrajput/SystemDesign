package expense.Validate;

import java.util.List;

import split.Split;

public class EqualExpenseValidate implements ExpenseValidate {

	@Override
	public boolean validateExpense(double totalAmount, List<Split> splitList) {
		// TODO Auto-generated method stub
		
		double calculateAmount = 0;
		
		double eachShouldOwe = totalAmount/splitList.size();
		
		for( Split split : splitList) {
			if(split.getAmountOwe()!=eachShouldOwe) return false;
			calculateAmount+=split.getAmountOwe();
		}
		
		
		
		return calculateAmount==totalAmount;
	}

}
