package org.tnsif.capgemimi.c2tc.oops;
class Human
{
	int age;
	String name;
}

public class BeforeEncapsulation 
{

	public static void main(String[] args)
	{
		Human obj=new Human();
		obj.age=22;
		obj.name="Priya";
		obj.age=20;
		obj.name="Divya";
		System.out.println( "Age is " +obj.age);
		System.out.println("Name is " +obj.name);
		}

}