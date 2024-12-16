package split;

import user.User;

public class Split {
  
	User owedBy;
	double amountOwe;
	
	public Split(User owedBy, double amountOwe) {
		super();
		this.owedBy = owedBy;
		this.amountOwe = amountOwe;
	}

	public User getOwedBy() {
		return owedBy;
	}

	public void setOwedBy(User owedBy) {
		this.owedBy = owedBy;
	}

	public double getAmountOwe() {
		return amountOwe;
	}

	public void setAmountOwe(double amountOwe) {
		this.amountOwe = amountOwe;
	}
	
	
	
}
