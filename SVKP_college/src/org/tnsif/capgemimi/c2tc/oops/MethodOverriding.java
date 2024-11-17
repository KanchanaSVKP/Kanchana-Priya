package org.tnsif.capgemimi.c2tc.oops;
class Animal3
{
	void makesound()
	{
		System.out.println("Animal makes a sound");
	}
}
class Dog3 extends Animal3
{
	void makesound()
	{
		System.out.println("Dog is eating");
	}
}
class cat3 extends Animal3
{
void makesound()
{
	System.out.println("Cat is eating");
}
}

public class MethodOverriding {

	public static void main(String[] args) 
	{
	Animal3 obj =new Animal3();
	Dog3 obj1=new Dog3();
	cat3 obj2=new cat3();
	obj.makesound();
	obj1.makesound();
	obj2.makesound();
	}

}
