package expense;

import java.util.List;

import split.Split;
import split.SplitType;
import user.User;

public class Expense {

	int id;
	String description;
	double totalAmountSpent;
	User paidBy;
	SplitType splitType;
	List<Split> oweBy;

	public Expense(int id, String description, double totalAmountSpent, User paidBy, SplitType splitType,
			List<Split> oweBy) {
		super();
		this.id = id;
		this.description = description;
		this.totalAmountSpent = totalAmountSpent;
		this.paidBy = paidBy;
		this.splitType = splitType;
		this.oweBy = oweBy;
	}

}
