package payment_template;

public abstract class PaymentFlow {

	public abstract void debitAmount();
	
	public abstract void creditAmount();
	
	public abstract void validate();
	
	public abstract void calculateCharges();
	
	public final void sendMoney() {
		
		validate();
		
		calculateCharges();
		
		debitAmount();
		
		creditAmount();
		
	}
	
}
