package org.tnsif.capgemimi.c2tc.oops;
class Animal5
{
	String name="Animal";
}
class Dog5 extends Animal5
{
	String name="Dog";
	void display()
	{
		System.out.println("Superclass name: " +super.name);
		System.out.println("Subclass name:" +name);
	}
}

 public class SuperField 
{
 public static void main(String[] args)
 {
		Dog5 dog=new Dog5();
		dog.display();
	

	}

}
