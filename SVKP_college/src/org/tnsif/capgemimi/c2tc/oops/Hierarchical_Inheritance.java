package org.tnsif.capgemimi.c2tc.oops;
class Animal2
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class cat2 extends Animal2 
{
	void meow()
	{
		System.out.println("cat is meowing");
	}
}
class Elephant2 extends Animal2
{
	void trumpet()
	{
		System.out.println("Elephant is trumpeting");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) 
	{
	
Dog2 dog=new Dog2();
cat2 cat=new cat2();
Elephant2 ele=new Elephant2();
dog.eat();
cat.eat();
ele.eat();
dog.bark();
cat.meow();
ele.trumpet();
}
}