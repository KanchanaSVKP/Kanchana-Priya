package org.tnsif.capgemini.c2tc.Final;
class calc1
{
	public void show()
	{
		System.out.println("AI Integration done by Hema");
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	  class advcalc extends calc1
	{
		public void show()
		{
			System.out.println("AI Integration by kanchana");
		}
		public void add(int a,int b)
		{
			System.out.println(a+b);
		}
	}
}
public class FinalMethod 
{
 public static void main(String[] args) 
 {
	calc1 obj=new calc1();
    obj.show();
 }

}


