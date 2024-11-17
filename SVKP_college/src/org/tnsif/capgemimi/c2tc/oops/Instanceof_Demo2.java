package org.tnsif.capgemimi.c2tc.oops;
class PaymentMethod
{
	void makepayment()
	{
		System.out.println("processing payment");
	}
}
class creditcard extends PaymentMethod
{
	void swipecard()
	{
		System.out.println("swipping credit card");
	}
}
class paypal extends PaymentMethod
{
	void loginpaypal()
	{
		System.out.println("logging into paypal");
	}
}
public class Instanceof_Demo2 {

	public static void main(String[] args)
	{
		PaymentMethod payment=new PaymentMethod();
		payment=new creditcard();
		if(payment instanceof creditcard)
		{
			creditcard cc=(creditcard) payment;
			cc.swipecard();
		}
		else
		{
			paypal pp=(paypal) payment;
			pp.loginpaypal();
			
		}

	}

}

