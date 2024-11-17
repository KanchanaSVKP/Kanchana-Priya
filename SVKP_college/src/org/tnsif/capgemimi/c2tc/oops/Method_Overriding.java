package org.tnsif.capgemimi.c2tc.oops;
class Vehicles
{
	void move()
	{
		System.out.println("the vehicles moves");
	}
}
class car extends Vehicles
{
	void move()
	{
		System.out.println("the car drives");
	}
}
class Bicycle extends Vehicles
{
	void move()
	{
		System.out.println("the bicycle pedals");
	}
}
class Airplane extends Vehicles
{
	void move()
	{
		System.out.println("the airplane flies");
	}
}
public class Method_Overriding {

	public static void main(String[] args) 
	{
	Vehicles obj=new Vehicles();
	obj=new car();
	obj.move();
	obj=new Bicycle();
	obj.move();
	obj=new Airplane();
	obj.move();
	}

}
