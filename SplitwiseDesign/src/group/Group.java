package group;

import java.util.ArrayList;
import java.util.List;

import expense.Expense;
import expense.ExpenseController;
import split.Split;
import split.SplitType;
import user.User;

public class Group {
	
	int id;
	String name;
    List<User> memberList;
    List<Expense> expenseList;
    private ExpenseController expenseController;
    
    public Group(int id, String name) {
    	this.id = id;
    	this.name = name;
    	memberList = new ArrayList<User>();
    	expenseList = new ArrayList<>();
    	expenseController = new ExpenseController();
    }
    
    public void addMember(User user) {
    	memberList.add(user);
    }
    
    public Expense createExpense(int id, String description, double totalAmount, User paidBy, SplitType splitType, List<Split> splitList) {
    	
    	Expense expense = expenseController.addExpense(id, description, totalAmount, paidBy, splitType, splitList);
    	expenseList.add(expense);
    	return expense;
    }
    
}
