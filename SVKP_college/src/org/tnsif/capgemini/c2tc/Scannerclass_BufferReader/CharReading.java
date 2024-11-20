package org.tnsif.capgemini.c2tc.Scannerclass_BufferReader;
import java.util.Scanner;
public class CharReading 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String");
	char c=scan.next().charAt(3);
	System.out.println("The Third character of the input string "+c);
	}

}
