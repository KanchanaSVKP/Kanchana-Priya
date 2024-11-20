package org.tnsif.capgemini.c2tc.Scannerclass_BufferReader;

import java.util.Scanner;

public class ScannerAllMethod 
{
	//import the Scanner class
	//create a Scanner object
	//prompt the user for input
	//Read input using scanner method
	//validate
	//close the Scanner

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=scan.nextLine();
		System.out.println("Enter your Age");
		int age=scan.nextInt();
		System.out.println("Enter your Height");
		float Height=scan.nextFloat();
		System.out.println("Are you a Student");
		boolean isstudent=scan.nextBoolean();
		System.out.println("Enter your aadhar number");
		long aadhar=scan.nextLong();
		scan.nextLine();
		System.out.println("Enter your Favorite Teacher");
		String teacher=scan.nextLine();
		System.out.println("Enter your hobby");
		String hobby=scan.nextLine();
		System.out.println("Enter your CGPA");
		double CGPA=scan.nextDouble();
		System.out.println("Enter your daily reading time in minutes");
		byte readingtime=scan.nextByte();
		System.out.println("Enter no.of Siblings you have");
		short Siblings=scan.nextShort();
		System.out.println("STUDENT INFORMATION");
		System.out.println("name "+name);
		System.out.println("Age "+age);
		System.out.println("Height "+Height);
		System.out.println("isStudent "+isstudent);
		System.out.println("aadhar "+aadhar);
		System.out.println("fav teacher "+teacher);
		System.out.println("hobby  "+hobby);
		System.out.println("CPGA  "+CGPA);
		System.out.println("readingtime "+readingtime);
		System.out.println("Siblings "+Siblings);
	}
}
