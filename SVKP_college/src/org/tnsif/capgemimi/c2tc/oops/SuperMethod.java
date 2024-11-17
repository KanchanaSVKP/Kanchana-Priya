package org.tnsif.capgemimi.c2tc.oops;
class Animal4
{
	void makesound() 
	{
		System.out.println("Animal makes a sound");
	}
}
class Dog4 extends Animal4
{
	void makesound()
	{
		super.makesound();
		System.out.println("Dog Barks");
	}
}

public class SuperMethod {

	public static void main(String[] args)
	{
		
Dog4 dog=new Dog4();
dog.makesound();
}

}

