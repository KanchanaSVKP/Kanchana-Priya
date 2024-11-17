package org.tnsif.capgemimi.c2tc.oops;
class person
{
}
class employee extends person
{
}
class manager extends employee
{
}
public class Instanceof_Demo1 
{
public static void main(String[] args)
{
person person= new person();
employee employee=new employee();
manager manager=new manager();
System.out.println(employee instanceof employee);
System.out.println(employee instanceof person);
System.out.println(employee instanceof manager);
System.out.println(manager instanceof manager);
System.out.println(manager instanceof manager);
System.out.println(manager instanceof manager);
System.out.println(person instanceof employee);
System.out.println(person instanceof manager);

	}

}