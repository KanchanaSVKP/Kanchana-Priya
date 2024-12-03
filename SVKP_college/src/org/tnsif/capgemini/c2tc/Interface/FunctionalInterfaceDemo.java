package org.tnsif.capgemini.c2tc.Interface;

class Greeting implements FunctionalInterface1
{

	@Override
	public void sayHello(String name)
	{
		System.out.println("Hello " +name+ " !");
		
	}
	
}

public class FunctionalInterfaceDemo 
{

	public static void main(String[] args)
	{
		FunctionalInterface1 obj=new Greeting();
		obj.sayHello("Kanchana");

	}

}
