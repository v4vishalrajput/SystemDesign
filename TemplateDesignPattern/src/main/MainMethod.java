package main;

import payment_concrete.PaymentToFriend;
import payment_concrete.PaymentToMerchant;
import payment_template.PaymentFlow;

public class MainMethod {
	public static void main(String[] args) {
		PaymentFlow payFriend = new PaymentToFriend();
		
		PaymentFlow payMerchant = new PaymentToMerchant();
		
		payFriend.sendMoney();
		
		payMerchant.sendMoney();
	}
}
