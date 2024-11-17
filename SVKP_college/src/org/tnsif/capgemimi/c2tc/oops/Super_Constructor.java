package org.tnsif.capgemimi.c2tc.oops;
 class Animal6
{
	Animal6()
	{
		System.out.println("Animal Constructor");
	}
}
 class Dog6 extends Animal6
 {
	 Dog6()
	 {
		 super();
		 System.out.println("Dog Constructor");
    }
 }
 

public class Super_Constructor {

	public static void main(String[] args)
	{
		Dog6 dog= new Dog6();
	}
}
