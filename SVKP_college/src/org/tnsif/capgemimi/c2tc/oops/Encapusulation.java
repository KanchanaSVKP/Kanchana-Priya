package org.tnsif.capgemimi.c2tc.oops;
class Human1
{
	 private int age;
	 private String name;
	 public void setAge(int a)
	 {
		 age=a;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public void setname(String n)
	 {
		 name=n;
	 }
	 public String getname() 
	 {
		 return name;
}
}
public class Encapusulation {

	public static void main(String[] args)
	{
		Human1 obj=new Human1();
		obj.setAge(15);
		obj.setname("priya");
		System.out.println(obj.getAge());
		System.out.println(obj.getname());
		obj.setAge(24);
		obj.setname("divya");
		System.out.println(obj.getAge());
		System.out.println(obj.getname());
	}

}
