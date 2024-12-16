package expense;

import java.util.List;

import balance_sheet.BalanceSheetController;
import expense.Validate.ExpenseValidate;
import expense.Validate.ExpenseValidateFactory;
import split.Split;
import split.SplitType;
import user.User;

public class ExpenseController {
	
	BalanceSheetController balanceSheetController;
	
	public ExpenseController() {
		super();
		this.balanceSheetController = new BalanceSheetController();
	}


	public Expense addExpense(int id, String description, double totalAmount, User paidBy, SplitType splitType, List<Split> splitList) {
		
		ExpenseValidate expenseValidate = ExpenseValidateFactory.getExpenseValidate(splitType);
		
		if(!expenseValidate.validateExpense(totalAmount, splitList)) {
			System.out.println("Expense calculation is wrong, Please check.");
			return null;
		}
		
		Expense expense = new Expense(id, description, totalAmount, paidBy, splitType, splitList);
		
		balanceSheetController.updateBalanceSheet(paidBy, totalAmount, splitList);
		
		return expense;
		
	}

}
