package expense.Validate;

import split.SplitType;

public class ExpenseValidateFactory {
	
	public static ExpenseValidate getExpenseValidate(SplitType splitType) {
		
		switch(splitType) {
		case UNEQUAL:
			return new EqualExpenseValidate();
		case PERCENTAGE:
			return new PercentageExpenseValidate();
		default:
			return new EqualExpenseValidate();
		}
	}

}
