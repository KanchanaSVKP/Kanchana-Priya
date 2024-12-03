package org.tnsif.capgemini.c2tc.Interface;
interface printer
{
	void print(String message);
}
interface Scanner
{
	void Scan(String Document);
}
class MultiFunctionDevice implements printer,Scanner
{

	@Override
	public void Scan(String Document) 
	{
		System.out.println("Scanning "+Document);	
	}

	@Override
	public void print(String message) 
	{
		System.out.println("Printing "+message);
		}
}

public class Multiple_Inheritance_Interface
{
	public static void main(String[] args)
	{
		MultiFunctionDevice obj=new MultiFunctionDevice();
         obj.print("Kanchana Priya");
         obj.Scan("Document.pdf");
	}

}
