package org.tnsif.capgemini.c2tc.Interface;

public class Car implements Vehicle
{
	private String model;
	//Constructor
	public Car(String model)
	{
		this.model=model;
	}
    
    @Override
	public void start() 
    {
		System.out.println("Car" +model+ "isstarting");
    }

	@Override
	public void stop() 
	{
		System.out.println("Car"+model+ "isstopped");
		}

}
