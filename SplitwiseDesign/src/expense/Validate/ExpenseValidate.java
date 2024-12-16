package expense.Validate;

import java.util.List;

import split.Split;

public interface ExpenseValidate {
	
	public boolean validateExpense(double totalAmount, List<Split> splitList);

}
