package org.tnsif.capgemini.c2tc.Static;
class Mathutils
{
	public static int Square(int number)
	{
		return number*number;
	}
	
	 public static  int add( int a,int b)
	{
		return a+b;
	}
}
  public class StaticMethod 
{
  public static void main(String[] args) 
  {
		int result1=Mathutils.Square(7);
		int result2=Mathutils.add(9, 18);
		System.out.println("Square of 7:"+result1);
		System.out.println("Add of numbers:"+result2);

	}

}
