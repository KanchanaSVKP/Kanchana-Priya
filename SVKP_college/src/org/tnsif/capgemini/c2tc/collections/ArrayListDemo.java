package org.tnsif.capgemini.c2tc.collections;
import java.util.ArrayList;
import java.util.List;

 public class ArrayListDemo
{
   public static void main(String[] args)  
{
	   List <String> colors=new ArrayList<>();
	   colors.add("Purple");
	   colors.add("Red");
	   colors.add("Black");
	   colors.add("Yellow");
	   //access the elements
	   System.out.println("Second Color: "+colors.get(3));
	   //modify the element
	   colors.set(2,"Green");
	   System.out.println("After Modification "+colors);
	   //check if element exists
	   if(colors.contains("Purple"))
	   {
		   System.out.println("Purple is in the List");
	   }
	   //check the size of ArrayList
	   System.out.println("Size of the ArrayList "+colors.size());
	   //print all elements using a for-each loop
	   for(String color:colors)
	   {
		   System.out.println(color);
	   }
	   //clear all the elements
	   colors.clear();
	   System.out.println("List cleared number of colors "+colors.size());
	   
	   }
   }

