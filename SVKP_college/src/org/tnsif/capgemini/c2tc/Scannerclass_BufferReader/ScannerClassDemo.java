package org.tnsif.capgemini.c2tc.Scannerclass_BufferReader;
import java.util.Scanner;
//import the Scanner class
//create a Scanner object
//prompt the user for input
//Read input using scanner method
//validate
//close the Scanner
public class ScannerClassDemo
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println("Enter your Age");
		int age=scan.nextInt();
		System.out.println("name: "+name+" "+"age: "+age);
		}
}
