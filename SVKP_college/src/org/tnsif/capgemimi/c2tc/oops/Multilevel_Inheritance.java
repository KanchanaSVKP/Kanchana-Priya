package org.tnsif.capgemimi.c2tc.oops;
class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
 class Mammal extends Animal1
 {
	 void Sleep()
	 {
		 System.out.println("Mammal is sleeping");
	 }
 }
 class Dog1 extends Mammal 
 {
	 void bark()
	 {
		System.out.println("Dog is barking"); 
	 }
	 }
 public class Multilevel_Inheritance {

	public static void main(String[] args)
	{
		Dog1 dog =new Dog1();
		dog.Sleep();
		dog.bark();
		}
}

