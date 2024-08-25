package payment_concrete;

import payment_template.PaymentFlow;

public class PaymentToMerchant extends PaymentFlow {

	@Override
	public void debitAmount() {
		// TODO Auto-generated method stub
       System.out.println("105 INR debited from your account inclusive of 5% transaction charges.");
	}

	@Override
	public void creditAmount() {
		// TODO Auto-generated method stub
		System.out.println("105 INR credited to your merchant's account.");
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
       System.out.println("your merchant's account validated.");
	}

	@Override
	public void calculateCharges() {
		// TODO Auto-generated method stub
		System.out.println("5% charges will be applied for this transaction.");
	}


}
