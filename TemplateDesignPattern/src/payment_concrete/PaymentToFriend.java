package payment_concrete;

import payment_template.PaymentFlow;

public class PaymentToFriend extends PaymentFlow {

	@Override
	public void debitAmount() {
		// TODO Auto-generated method stub
       System.out.println("102 INR debited from your account inclusive of 2% transaction charges.");
	}

	@Override
	public void creditAmount() {
		// TODO Auto-generated method stub
		System.out.println("102 INR credited to your friend's account.");
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
       System.out.println("your friend's account validated.");
	}

	@Override
	public void calculateCharges() {
		// TODO Auto-generated method stub
		System.out.println("2% charges will be applied for this transaction.");
	}

}
