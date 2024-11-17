package org.tnsif.capgemimi.c2tc.oops;
public class Abstraction {

	public static void main(String[] args) 
	{
		KanchanaDemo obj=new DivyaDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMonitoring();
		}
}
 abstract class KanchanaDemo
{
	public void calling()
	{
		System.out.println("Calling");
	}
	public abstract void AIIntegration();
	public abstract void SatelliteComm();
	public abstract void HealthMonitoring();
}
abstract class PriyaDemo extends KanchanaDemo
{
	public void AIIntegration()
	{
		System.out.println("Phone is integrated with AIIntergration");
	}
}

		class DivyaDemo extends PriyaDemo
		{
			public void SatelliteComm()
			{
				System.out.println("phone is integrated with SatelliteComm");
			}
			public void HealthMonitoring() 
			{
				System.out.println("phone is integrated with HealthMonitoring");
			}
		}
