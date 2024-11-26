package org.tnsif.capgemini.c2tc.Static;

public class StaticBlock
{
	public void display()
	{
		System.out.println("Instance Block-1");
	
	}
	static
	{
		System.out.println("Static Block-1");
	}
	static 
	{
		System.out.println("Static Block-2");
	}
    public static void main(String[] args) 
    {
		StaticBlock obj=new StaticBlock();
		obj.display();
	}

}
