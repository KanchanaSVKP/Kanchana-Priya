package org.tnsif.capgemini.c2tc.Interface;
interface Vehicle1
{
	void start();
	void stop();
	int Max_Speed=120;
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static  void  checkMaintaince()
	{
		System.out.println("Vehicle is maintaince check complete");
	}
}
class Car5 implements Vehicle1
{
	private String model;
	Car5(String model)
	{
		this.model=model;
	}
	@Override
	public void start() 
	{
		
		System.out.println("Car" +model+ "isstarted");
	}
	@Override
	public void stop()
	{
		System.out.println("Car" +model+ "isstopped");

	}
	
}

public class Default_Static
{
   public static void main(String[] args)
   {
		Vehicle1 obj=new Car5("Audi");
		obj.start();
		obj.stop();
		
		System.out.println("Max_speed of the vehicle "+Vehicle1.Max_Speed);
         obj.repair();
         Vehicle1.checkMaintaince();
	}

}
