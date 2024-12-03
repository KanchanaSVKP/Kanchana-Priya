package org.tnsif.capgemini.c2tc.Interface;

public class MarkerDemo {

	public static void main(String[] args)
	{
		Registrable s=new Student1(11,"Neha",12000,"C++");
		Registrable s1=new Student1(102,"Priya",13000,"java");
		Object obj=new Object();//the class object is built-in class in java that is a part of java.lang package
    if(s1 instanceof Registrable)
			System.out.println("Student is registered in course");
		else
			System.out.println("Student is  not registered in course");
	}

}
