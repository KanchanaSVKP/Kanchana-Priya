package org.tnsif.capgemini.c2tc.oops;
class Myclass2
{
	int rollno;
	String name;
	String Department;
	//Parameterized Constructor
	Myclass2(int rollno,String name,String Department)
	{
		this.rollno=rollno;
		this.name=name;
		this.Department=Department;
	}
}

public class ParameterizedConstructor
{
public static void main(String[] args) 
{
	Myclass2 obj=new Myclass2(1,"Divya","MCA");
	Myclass2 obj1=new Myclass2(2,"Lakshmi","MBA");
	Myclass2 obj2=new Myclass2(3,"Nandana","MSc");
	System.out.println(obj.rollno+" "+obj.name+" "+obj.Department);
	System.out.println(obj1.rollno+" "+obj1.name+" "+obj1.Department);
	System.out.println(obj2.rollno+" "+obj2.name+" "+obj2.Department);
	
	

	}

}
