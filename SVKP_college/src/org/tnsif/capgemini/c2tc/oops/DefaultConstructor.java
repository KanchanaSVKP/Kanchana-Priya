package org.tnsif.capgemini.c2tc.oops;
class Myclass
{
	int rollno;
	String name;
	String Department;
	{
		
	//Default constructor
	 rollno=1;
	 name="priya";
	 Department="MCA";
}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		System.out.println(obj.rollno+" "+obj.name+" "+obj.Department);


	}

}
