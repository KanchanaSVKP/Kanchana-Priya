package org.tnsif.capgemini.c2tc.Scannerclass_BufferReader;

import java.util.Scanner;

public class AdvancedScannerClass
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some data you can enter number or text");
		while(scan.hasNext())
		{
			if(scan.hasNextInt())
			{
				int intvalue=scan.nextInt();
				System.out.println("Read an Integer "+intvalue);
			}
			else if(scan.hasNextDouble()) 
			{
				double doublevalue=scan.nextDouble();
				System.out.println("Read a Double "+doublevalue);
			}
			else
			{
				String Stringvalue=scan.next();
				System.out.println("Unknow Input "+Stringvalue);
			}	
		}
	}
}


