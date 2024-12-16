package expense.Validate;

import java.util.List;

import split.Split;

public  class UnequalExpenseValidate implements ExpenseValidate {

	@Override
	public boolean validateExpense(double totalAmount, List<Split> splitList) {
		// TODO Auto-generated method stub
		double calculateAmount = 0;
		
		
		for( Split split : splitList) {
			
			calculateAmount+=split.getAmountOwe();
		}
		
		
		
		return calculateAmount==totalAmount;
		
	}

}
