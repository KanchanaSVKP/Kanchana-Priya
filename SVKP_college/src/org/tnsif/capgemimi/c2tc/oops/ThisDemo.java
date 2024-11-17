package org.tnsif.capgemimi.c2tc.oops; 
class product
{
	double price;
	product(double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10;
	}
double CalculateFinalPrice() 
{
	return this.price-this.calculateDiscount();
}
}

public class ThisDemo 
{
 public static void main(String[] args)
	{
	product product=new product(400);
	System.out.println("Final Price" +product.CalculateFinalPrice());

	}
}
