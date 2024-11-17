package org.tnsif.capgemimi.c2tc.oops;

public class KIA_Motors {
	int noCar;
	String model;
	 String engine;
	 int speed;
	 
	 void display()
	 {
		 System.out.println("This is KIA Motors, Welcome to our show room");
		 
	 }
	 void welcome()
	 {
		 System.out.println("Welcome");
	 }

	public static void main(String[] args) 
	{
		KIA_Motors obj= new KIA_Motors();
		obj.display();
		obj.welcome();
		obj.noCar=2727;
		obj.model="Creta";
		obj.engine="Petrol Stream";
		obj.speed=60;
		System.out.println(obj.noCar);
		System.out.println(obj.model);
		System.out.println(obj.engine);
		System.out.println(obj.speed);
		}

}
