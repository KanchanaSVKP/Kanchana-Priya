package org.tnsif.capgemini.c2tc.Interface;

public class InterfaceDemo {

	public static void main(String[] args) 
	{
		Vehicle Car=new Car("Audi");
		Vehicle Bike=new Bike("Mountain Bike");

		Car.start();
		Car.stop();
		Bike.start();
		Bike.stop();
		System.out.println("Maximum speed for Vehicle "+Vehicle.Max_Speed);

	}

}
