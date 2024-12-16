package expense.Validate;

import java.util.List;

import split.Split;

public class PercentageExpenseValidate implements ExpenseValidate {

	@Override
	public boolean validateExpense(double totalAmount, List<Split> splitList) {
		// TODO Auto-generated method stub
		double totalPercentage = 0;
		
		
		for( Split split : splitList) {
			
			totalPercentage+=split.getAmountOwe();
		}
		
		
		
		return totalPercentage==100;
	
	}

}
